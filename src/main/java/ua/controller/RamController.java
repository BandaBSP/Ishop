package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.RamServiñe;

@Controller
public class RamController {
	
	@Autowired
	private RamServiñe ramServiñe;

	@RequestMapping("/admin/ram")
	public String showRam(Model model){
		model.addAttribute("rams", ramServiñe.findAll());
		return "adminRam";
	}
	
	@RequestMapping("/admin/ram/delete/{id}")
	public String deleteRam(@PathVariable int id){
		ramServiñe.delete(id);
		return "redirect:/admin/ram";
	}
	
	@RequestMapping(value= "/admin/ram", method=RequestMethod.POST)
	public String showRam(@RequestParam int ramGb){
		ramServiñe.save(ramGb);
		return "redirect:/admin/ram";
	}
}
