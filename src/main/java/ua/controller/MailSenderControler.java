//package ua.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailSender;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import ua.entity.User;
//import ua.service.UserService;
//@Controller
//public class MailSenderControler {
//
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private MailSender mailSender;
//	
//	@ModelAttribute("contactus")
//	public User getForm(){
//		return new User();
//	}
//	
//	@RequestMapping(value="/contactus", method=RequestMethod.POST)
//	public String save(@ModelAttribute("contactus") User user){
//		userService.send(message);
//		return "redirect:/";
//	}
//	MailSender.
//	
//	
//	
//	
//	
//}
