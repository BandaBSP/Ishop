package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.TypeProcessorService;

@Controller
public class TypeProcessorController {

	@Autowired
	private TypeProcessorService typeprocessorService;

	@RequestMapping("/admin/typeprocessor")
	public String showTypeProcessor(Model model){
		model.addAttribute("typeprocessors", typeprocessorService.findAll());
		return "admintypeprocessor";
	}
	
	@RequestMapping("/admin/typeprocessor/delete/{id}")
	public String deleteTypeProcessor(@PathVariable int id){
		typeprocessorService.delete(id);
		return "redirect:/admin/typeprocessor";
	}
	
	@RequestMapping(value= "/admin/typeprocessor", method=RequestMethod.POST)
	public String showTypeProcessor(@RequestParam String name){
		typeprocessorService.save(name);
		return "redirect:/admin/typeprocessor";
	}
	
}

