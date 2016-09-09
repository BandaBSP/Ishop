package ua.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.form.VideoAdapterForm;
import ua.service.VideoAdapterService;

@Controller
public class VideoAdapterController {

	@Autowired
	private VideoAdapterService videoadapterService;

	@RequestMapping("/admin/videoadapter")
	public String showVideoAdapterr(@ModelAttribute("form") @Valid VideoAdapterForm form, BindingResult br, Model model) {
		model.addAttribute("videoadapters", videoadapterService.findAll());
		return "adminvideoadapter";
	}

	@RequestMapping("/admin/videoadapter/delete/{id}")
	public String delete(@PathVariable int id) {
		videoadapterService.delete(id);
		return "redirect:/admin/videoadapter";
	}

	
	@RequestMapping(value = "/admin/videoadapter/update/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("form", videoadapterService.findForForm(id));
		model.addAttribute("videoadapters", videoadapterService.findAll());
		return "adminvideoadapter";
	}
	
	@RequestMapping(value = "/admin/videoadapter", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid VideoAdapterForm form, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("videoadapters", videoadapterService.findAll());
			return "adminvideoadapter";
		}
		videoadapterService.save(form);
		return "redirect:/admin/videoadapter";
	}

}
