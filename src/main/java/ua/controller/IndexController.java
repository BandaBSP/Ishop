package ua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	@RequestMapping("/admin")
	public String showAdmin() {
		return "adminPanel";
	}

	@RequestMapping("/adminRam")
	public String showAdminRam() {
		return "adminRam";
	}

	@RequestMapping("/adminVideoadapter")
	public String showAdminVideoAdapter() {
		return "adminvideoadapter";
	}

	@RequestMapping("/adminTypeProcessor")
	public String showAdminTypeProcessor() {
		return "admintypeprocessor";
	}


	
}
