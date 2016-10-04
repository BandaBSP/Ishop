package ua.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.entity.TypeProcessor;
import ua.entity.—oreProcessor;
import ua.form.ProcessorForm;
import ua.form.filter.ProcessorFilterForm;
import ua.service.ProcessorService;
import ua.service.TypeProcessorService;
import ua.service.—oreProcessorService;
import ua.service.implementation.editor.TypeProcessorEditor;
import ua.service.implementation.editor.—oreProcessorEditor;

@Controller
public class ProcessorController {

	@Autowired
	private ProcessorService processorService;

	@Autowired
	private TypeProcessorService typeprocessorService;

	@Autowired
	private —oreProcessorService coreprocessorService;

	@InitBinder("form")
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(—oreProcessor.class,
				new —oreProcessorEditor(coreprocessorService));
		binder.registerCustomEditor(TypeProcessor.class,
				new TypeProcessorEditor(typeprocessorService));
	}

	@ModelAttribute("form")
	public ProcessorForm getForm() {
		return new ProcessorForm();
	}

	@ModelAttribute("filter")
	public ProcessorFilterForm getFilter() {
		return new ProcessorFilterForm();
	}

	@RequestMapping("/admin/processor")
	public String show(Model model, @PageableDefault(5) Pageable pageable,
			@ModelAttribute(value = "filter") ProcessorFilterForm filter) {
		model.addAttribute("coreprocessors", coreprocessorService.findAll())
				.addAttribute("processors", processorService.findAll())
				.addAttribute("typeprocessors", typeprocessorService.findAll())
				.addAttribute("page",
						processorService.findAll(pageable, filter));
		return "adminProcessor";
	}

	@RequestMapping(value = "/admin/processor", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid ProcessorForm form,
			BindingResult br, Model model,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value = "filter") ProcessorFilterForm filter) {
		if (br.hasErrors()) {
			model.addAttribute("processors", processorService.findAll());
			model.addAttribute("coreprocessors", coreprocessorService.findAll());
			model.addAttribute("typeprocessors", typeprocessorService.findAll());
			model.addAttribute("page", processorService.findAll(pageable, filter));
			return "adminProcessor";
		}
		processorService.save(form);
		return "redirect:/admin/processor" + getParams(pageable, filter);
	}
	
	
	@RequestMapping(value="/admin/processor/update/{id}")
	public String update(Model model, @PathVariable int id,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value="filter") ProcessorFilterForm form){
		model.addAttribute("form", processorService.findForForm(id));
		model.addAttribute("page", processorService.findAll(pageable, form));
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		model.addAttribute("typeprocessors", typeprocessorService.findAll());
		return "adminProcessor";
	}

	@RequestMapping("/admin/processor/delete/{id}")
	public String delete(@PathVariable int id,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value = "filter") ProcessorFilterForm filter) {
		processorService.delete(id);
		return "redirect:/admin/processor" + getParams(pageable, filter);
	}

	private String getParams(Pageable pageable, ProcessorFilterForm form) {
		StringBuilder buffer = new StringBuilder();
		buffer.append("?page=");
		buffer.append(String.valueOf(pageable.getPageNumber() + 1));
		buffer.append("&size=");
		buffer.append(String.valueOf(pageable.getPageSize()));
		if (pageable.getSort() != null) {
			buffer.append("&sort=");
			Sort sort = pageable.getSort();
			sort.forEach((order) -> {
				buffer.append(order.getProperty());
				if (order.getDirection() != Direction.ASC)
					buffer.append(",desc");
			});
		}
		buffer.append("&min=");
		buffer.append(form.getMin());
		buffer.append("&max=");
		buffer.append(form.getMax());
		for (Integer i : form.getIngredientIds()) {
			buffer.append("&ingredientIds=");
			buffer.append(i.toString());
		}
		for (Integer i : form.getMsIds()) {
			buffer.append("&msIds=");
			buffer.append(i.toString());
		}
		return buffer.toString();
	}
}
