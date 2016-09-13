package ua.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.entity.Ram;
import ua.form.RamForm;
import ua.service.RamServiñe;

@Controller
@SessionAttributes("ram")
public class RamController {
	
	@Autowired
	private RamServiñe ramService;
	
	@ModelAttribute("ram")
	public Ram getForm(){
		return new Ram();
	}

	@RequestMapping("/admin/ram")
	public String showRam(Model model, @PageableDefault(5) Pageable pageable){
		model.addAttribute("page", ramService.findAll(pageable));
		return "adminRam";
	}
	
	
	@RequestMapping("/admin/ram/delete/{id}")
	public String delete(@PathVariable int id, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="size", required=false, defaultValue="5") int size,
			@RequestParam(value="sort", required=false, defaultValue="") String sort){
		ramService.delete(id);
		return "redirect:/admin/ram?page="+page+"&size="+size+"&sort="+sort;
		
	}
	
	
	@RequestMapping(value="/admin/ram", method=RequestMethod.POST)
	public String save(@ModelAttribute("ram") @Valid RamForm form, BindingResult br, Model model, HttpSession session){
		if(br.hasErrors()){
			model.addAttribute("rams", ramService.findAll());
			return "adminRam";
		}
		ramService.save(form);
		session.getAttribute("ram");
		return "redirect:/admin/ram";
	}
	
	@RequestMapping(value = "/admin/ram/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault(5) Pageable pageable, HttpSession session) {
		model.addAttribute("page", ramService.findAll(pageable));
		model.addAttribute("rams", ramService.findAll());
		session.getAttribute("ram");
		return "adminRam";
	}
	
}
