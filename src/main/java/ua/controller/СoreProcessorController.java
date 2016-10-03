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

import ua.entity.ÑoreProcessor;
import ua.form.filter.ÑoreProcessorFilterForm;
import ua.service.ÑoreProcessorService;
import ua.service.implementation.validator.ÑoreProcessorValidator;

@Controller
public class ÑoreProcessorController {
	
	@Autowired
	private ÑoreProcessorService coreprocessorService;
	
	@ModelAttribute("coreprocessor")
	public ÑoreProcessor getForm(){
		return new ÑoreProcessor();
	}
	
	@ModelAttribute("filter")
	public ÑoreProcessorFilterForm getFilter(){
		return new ÑoreProcessorFilterForm();
	}
	
	@InitBinder("coreprocessor")
	protected void initBinder(WebDataBinder binder){
	   binder.setValidator(new ÑoreProcessorValidator(coreprocessorService));
	}

	@RequestMapping("/admin/coreprocessor")
	public String show(Model model,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value="filter") ÑoreProcessorFilterForm form){
		model.addAttribute("page", coreprocessorService.findAll(pageable, form));
		return "adminÑoreProcessor";
	}
	
	@RequestMapping("/admin/coreprocessor/delete/{id}")
	public String delete(@PathVariable int id,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value="filter") ÑoreProcessorFilterForm form){
		coreprocessorService.delete(id);
		return "redirect:/admin/coreprocessor"+getParams(pageable, form);
	}
	
	@RequestMapping("/admin/coreprocessor/update/{id}")
	public String update(Model model,
			@PathVariable int id,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value="filter") ÑoreProcessorFilterForm form){
		model.addAttribute("coreprocessor", coreprocessorService.findOne(id));
		model.addAttribute("page", coreprocessorService.findAll(pageable, form));
		return "adminÑoreProcessor";
	}
	
	@RequestMapping(value= "/admin/coreprocessor", method=RequestMethod.POST)
	public String save(@ModelAttribute("coreprocessor") @Valid ÑoreProcessor coreprocessor,
			BindingResult br,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value="filter") ÑoreProcessorFilterForm form,
			Model model){
		if(br.hasErrors()){
			model.addAttribute("page", coreprocessorService.findAll(pageable, form));
			return "adminÑoreProcessor";
		}
		coreprocessorService.save(coreprocessor);
		return "redirect:/admin/coreprocessor"+getParams(pageable, form);
	}
	
	
	
	private String getParams(Pageable pageable, ÑoreProcessorFilterForm form){
		StringBuilder buffer = new StringBuilder();
		buffer.append("?page=");
		buffer.append(String.valueOf(pageable.getPageNumber()+1));
		buffer.append("&size=");
		buffer.append(String.valueOf(pageable.getPageSize()));
		if(pageable.getSort()!=null){
			buffer.append("&sort=");
			Sort sort = pageable.getSort();
			sort.forEach((order)->{
				buffer.append(order.getProperty());
				if(order.getDirection()!=Direction.ASC)
				buffer.append(",desc");
			});
		}
		buffer.append("&search=");
		buffer.append(form.getSearch());
		return buffer.toString();
	}
}
