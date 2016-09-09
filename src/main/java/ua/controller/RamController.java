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

import ua.form.RamForm;
import ua.service.RamServi�e;

@Controller
public class RamController {

	@Autowired
	private RamServi�e ramServi�e;

	@RequestMapping("/admin/ram")
	public String showRam(@ModelAttribute("form") @Valid RamForm form, BindingResult br, Model model) {
		model.addAttribute("rams", ramServi�e.findAll());
		return "adminRam";
	}

	@RequestMapping("/admin/ram/delete/{id}")
	public String deleteRam(@PathVariable int id) {
		ramServi�e.delete(id);
		return "redirect:/admin/ram";
	}

//	@RequestMapping(value = "/admin/ram", method = RequestMethod.POST)
//	public String showRam(@ModelAttribute("form") @Valid RamForm form, BindingResult br, Model model) {
//		ramServi�e.save(form);
//		return "redirect:/admin/ram";
//	}
	
	@RequestMapping(value = "/admin/ram", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid RamForm form, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("rams", ramServi�e.findAll());
			return "adminRam";
		}
		ramServi�e.save(form);
		return "redirect:/admin/ram";
	}
	
	@RequestMapping(value = "/admin/ram/update/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("form", ramServi�e.findForForm(id));
		model.addAttribute("rams", ramServi�e.findAll());
		return "adminRam";
	}
}
