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

import ua.form.HddForm;
import ua.service.HddService;

@Controller
public class HddController {

	@Autowired
	private HddService hddService;

	// private TypeHdd typeHdd;

	// @InitBinder("form")
	// protected void initBinder(WebDataBinder binder){
	// binder.registerCustomEditor(ÑoreProcessor.class, new
	// ÑoreProcessorEditor(coreprocessorService));
	// binder.registerCustomEditor(TypeProcessor.class, new
	// TypeProcessorEditor(typeprocessorService));
	// binder.setValidator(new ÑoreProcessorFormValidator(recipeService));
	// }

	@ModelAttribute("form")
	public HddForm getForm() {
		return new HddForm();
	}

	@RequestMapping("/admin/hdd")
	public String showHdd(@ModelAttribute("form") @Valid HddForm form,BindingResult br, Model model) {
		model.addAttribute("hdds", hddService.findAll());
		return "adminhdd";
	}

	@RequestMapping(value = "/admin/hdd", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") @Valid HddForm form,	BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("hdds", hddService.findAll());
			return "adminhdd";
		}
		hddService.save(form);
		return "redirect:/admin/hdd";
	}

	@RequestMapping(value = "/admin/hdd/update/{id}")
	public String update(Model model, @PathVariable int id) {
		model.addAttribute("form", hddService.findForForm(id));
		model.addAttribute("hdds", hddService.findAll());
		return "adminhdd";
	}

	@RequestMapping(value = "/admin/hdd/delete/{id}")
	public String delete(@PathVariable int id) {
		hddService.delete(id);
		return "redirect:/admin/hdd";
	}

}
