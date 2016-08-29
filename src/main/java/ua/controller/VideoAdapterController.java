package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.VideoAdapterService;

@Controller
public class VideoAdapterController {

	@Autowired
	private VideoAdapterService videoadapterService;

	@RequestMapping("/admin/videoadapter")
	public String showVideoAdapterr(Model model){
		model.addAttribute("videoadapters", videoadapterService.findAll());
		return "adminvideoadapter";
	}
	
	@RequestMapping("/admin/videoadapter/delete/{id}")
	public String deleteVideoAdapter(@PathVariable int id){
		videoadapterService.delete(id);
		return "redirect:/admin/videoadapter";
	}
	
	@RequestMapping(value= "/admin/videoadapter", method=RequestMethod.POST)
	public String showVideoAdapter(@RequestParam String name){
		videoadapterService.save(name);
		return "redirect:/admin/videoadapter";
	}
	
}

