package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.ProcessorService;

@Controller
public class ProcessorController {

	@Autowired
	private ProcessorService processorService;

	@RequestMapping("/admin/processor")
	public String showProcessor(Model model){
		model.addAttribute("processors", processorService.findAll());
		return "adminprocessor";
	}
	
	@RequestMapping("/admin/processor/delete/{id}")
	public String deleteProcessor(@PathVariable int id){
		processorService.delete(id);
		return "redirect:/admin/processor";
	}
	
	@RequestMapping(value= "/admin/processor", method=RequestMethod.POST)
	public String showProcessor(@RequestParam String name){
		processorService.save(name);
		return "redirect:/admin/processor";
	}
	
}

