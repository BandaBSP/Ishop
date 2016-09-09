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

import ua.form.TypeProcessorForm;
import ua.service.TypeProcessorService;

@Controller
public class TypeProcessorController {

	@Autowired
	private TypeProcessorService typeprocessorService;

	@ModelAttribute("form")
	public TypeProcessorForm getForm() {
		return new TypeProcessorForm();
	}

	@RequestMapping("/admin/typeprocessor")
	public String showTypeProcessor(Model model) {
		model.addAttribute("typeprocessors", typeprocessorService.findAll());
		return "admintypeprocessor";
	}

	@RequestMapping("/admin/typeprocessor/delete/{id}")
	public String delete(@PathVariable int id) {
		typeprocessorService.delete(id);
		return "redirect:/admin/typeprocessor";
	}

	@RequestMapping(value = "/admin/typeprocessor/update/{id}")
	public String update(Model model, @PathVariable int id) {
		model.addAttribute("form", typeprocessorService.findForForm(id));
		model.addAttribute("typeprocessors", typeprocessorService.findAll());
		return "admintypeprocessor";
	}

	@RequestMapping(value = "/admin/typeprocessor", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid TypeProcessorForm form,
			BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("typeprocessors", typeprocessorService.findAll());
			return "admintypeprocessor";
		}
		typeprocessorService.save(form);
		return "redirect:/admin/typeprocessor";
	}

}
