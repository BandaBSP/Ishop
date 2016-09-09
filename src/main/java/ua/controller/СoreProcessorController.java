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

import ua.form.—oreProcessorForm;
import ua.service.—oreProcessorService;

@Controller
public class —oreProcessorController {

	@Autowired
	private —oreProcessorService coreprocessorService;

	@ModelAttribute("form")
	public —oreProcessorForm getForm() {
		return new —oreProcessorForm();
	}

	@RequestMapping("/admin/coreprocessor")
	public String show—oreProcessor(Model model) {
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		return "admincoreprocessor";
	}

	@RequestMapping("/admin/coreprocessor/delete/{id}")
	public String delete(@PathVariable int id) {
		coreprocessorService.delete(id);
		return "redirect:/admin/coreprocessor";
	}


	@RequestMapping(value = "/admin/coreprocessor/update/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("form", coreprocessorService.findForForm(id));
		model.addAttribute("coreprocessors", coreprocessorService.findAll());
		return "admincoreprocessor";
	}

	@RequestMapping(value = "/admin/coreprocessor", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid —oreProcessorForm form, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("coreprocessors", coreprocessorService.findAll());
			return "admincoreprocessor";
		}
		coreprocessorService.save(form);
		return "redirect:/admin/coreprocessor";
	}
	
}
