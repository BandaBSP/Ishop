package ua.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import ua.entity.ÑoreProcessor;
import ua.form.ProcessorForm;
import ua.service.ProcessorService;
import ua.service.TypeProcessorService;
import ua.service.ÑoreProcessorService;
import ua.service.implementation.editor.TypeProcessorEditor;
import ua.service.implementation.editor.ÑoreProcessorEditor;

@Controller
public class ProcessorController {

	@Autowired
	private ProcessorService processorService;

	@Autowired
	private TypeProcessorService typeprocessorService;


	@Autowired
	private ÑoreProcessorService coreprocessorService;

	@InitBinder("form")
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ÑoreProcessor.class,
				new ÑoreProcessorEditor(coreprocessorService));
		binder.registerCustomEditor(TypeProcessor.class,
				new TypeProcessorEditor(typeprocessorService));
		// binder.setValidator(new ÑoreProcessorFormValidator(recipeService));
	}

	@ModelAttribute("form")
	public ProcessorForm getForm() {
		return new ProcessorForm();
	}

	@RequestMapping("/admin/processor")
	public String showProcessor(Model model) {
		model.addAttribute("processors", processorService.findAll());
		model.addAttribute("typeprocessors", typeprocessorService.findAll());
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		return "adminProcessor";
	}

	@RequestMapping(value = "/admin/processor", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid ProcessorForm form,BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("processors", processorService.findAll());
			model.addAttribute("typeprocessors", typeprocessorService.findAll());
			model.addAttribute("coreprocessors", coreprocessorService.findAll());
			return "adminProcessor";
		}
		processorService.save(form);
		return "redirect:/admin/processor";
	}

	@RequestMapping(value = "/admin/processor/update/{id}")
	public String update(Model model, @PathVariable int id) {
		model.addAttribute("form", processorService.findForForm(id));
		model.addAttribute("processors", processorService.findAll());
		model.addAttribute("typeprocessors", typeprocessorService.findAll());
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		return "adminProcessor";
	}

	@RequestMapping(value = "/admin/processor/delete/{id}")
	public String delete(@PathVariable int id) {
		processorService.delete(id);
		return "redirect:/admin/processor";
	}

}
