//package ua.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import ua.entity.Hdd;
//import ua.entity.Processor;
//import ua.entity.Ram;
//import ua.entity.VideoAdapter;
//import ua.form.KomputerForm;
//import ua.service.HddService;
//import ua.service.KomputerService;
//import ua.service.ProcessorService;
//import ua.service.RamServiñe;
//import ua.service.VideoAdapterService;
//import ua.service.implementation.editor.HddEditor;
//import ua.service.implementation.editor.ProcessorEditor;
//import ua.service.implementation.editor.RamEditor;
//import ua.service.implementation.editor.VideoAdapterEditor;
//
//@Controller
//public class KomputerController {
//
//	@Autowired
//	private KomputerService komputerService;
//
//	@Autowired
//	private HddService hddService;
//	
//	@Autowired
//	private ProcessorService processorService;
//
//	@Autowired
//	private RamServiñe ramServiñe;
//	
//	@Autowired
//	private VideoAdapterService videoadapterService;
//	
//	
//	@InitBinder("form")
//	protected void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(Hdd.class, new HddEditor(hddService));
//		binder.registerCustomEditor(Ram.class, new RamEditor(ramServiñe));
//		binder.registerCustomEditor(VideoAdapter.class, new VideoAdapterEditor(videoadapterService));
//		binder.registerCustomEditor(Processor.class, new ProcessorEditor(processorService));
//	}
//
//	@ModelAttribute("form")
//	public KomputerForm getForm() {
//		return new KomputerForm();
//	}
//
//	@RequestMapping("/admin/komputer")
//	public String showKomputer(Model model) {
//		model.addAttribute("komputers", komputerService.findAll());
//		model.addAttribute("hdds", hddService.findAll());
//		model.addAttribute("processors", processorService.findAll());
//		model.addAttribute("rams", ramServiñe.findAll());
//		model.addAttribute("videoadapters", videoadapterService.findAll());
//		return "adminKomputer";
//	}
//
//	@RequestMapping(value = "/admin/komputer", method = RequestMethod.POST)
//	public String save(@ModelAttribute("form") @Valid KomputerForm form,BindingResult br, Model model) {
//		if (br.hasErrors()) {
//			model.addAttribute("komputers", komputerService.findAll());
//			model.addAttribute("hdds", hddService.findAll());
//			model.addAttribute("processors", processorService.findAll());
//			model.addAttribute("rams", ramServiñe.findAll());
//			model.addAttribute("videoadapters", videoadapterService.findAll());
//			return "adminKomputer";
//		}
//		komputerService.save(form);
//		return "redirect:/admin/komputer";
//	}
//
//	@RequestMapping(value = "/admin/komputer/update/{id}")
//	public String update(Model model, @PathVariable int id) {
//		model.addAttribute("form", komputerService.findForForm(id));
//		model.addAttribute("komputers", komputerService.findAll());
//		model.addAttribute("hdds", hddService.findAll());
//		model.addAttribute("processors", processorService.findAll());
//		model.addAttribute("rams", ramServiñe.findAll());
//		model.addAttribute("videoadapters", videoadapterService.findAll());
//		return "adminKomputer";
//	}
//
//	@RequestMapping(value = "/admin/komputer/delete/{id}")
//	public String delete(@PathVariable int id) {
//		komputerService.delete(id);
//		return "redirect:/admin/komputer";
//	}
//
//}
