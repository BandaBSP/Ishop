package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.form.—oreProcessorForm;
import ua.service.—oreProcessorService;

@Controller
public class —oreProcessorController {

	@Autowired
	private —oreProcessorService coreprocessorService;
	
	@ModelAttribute("form")
	public —oreProcessorForm getForm(){
		return new —oreProcessorForm();
	}

	@RequestMapping("/admin/coreprocessor")
	public String show—oreProcessor(Model model){
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		return "admincoreprocessor";
	}
	
	@RequestMapping("/admin/coreprocessor/delete/{id}")
	public String deleteRam(@PathVariable int id){
		coreprocessorService.delete(id);
		return "redirect:/admin/coreprocessor";
	}
	
	@RequestMapping(value= "/admin/coreprocessor", method=RequestMethod.POST)
	public String show—oreProcessor(@RequestParam int core){
		coreprocessorService.save(core);
		return "redirect:/admin/coreprocessor";
	}
	
	@RequestMapping(value="/admin/coreprocessor/update/{id}")
	public String update(Model model, @PathVariable int id){
		model.addAttribute("form", coreprocessorService.findForForm(id));
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		return "admincoreprocessor";
	}
}

