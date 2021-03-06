package ua.controllerUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.form.filter.KomputerFilterForm;
import ua.service.HddService;
import ua.service.KomputerService;
import ua.service.ProcessorService;
import ua.service.RamServiņe;
import ua.service.VideoAdapterService;

@Controller
public class KomputerUserController {

	@Autowired
	private KomputerService komputerService;

	@Autowired
	private HddService hddService;
	
	@Autowired
	private ProcessorService processorService;

	@Autowired
	private RamServiņe ramServiņe;
	
	@Autowired
	private VideoAdapterService videoadapterService;
	

	@ModelAttribute("filter")
	public KomputerFilterForm getFilter(){
		return new KomputerFilterForm();
	}
	

	@RequestMapping("/komputer")
	public String show(Model model,
			@PageableDefault(5) Pageable pageable,
			@ModelAttribute(value="filter") KomputerFilterForm form){
		model.addAttribute("page", komputerService.findAll(pageable, form));
		model.addAttribute("hdds", hddService.findAll());
		model.addAttribute("rams", ramServiņe.findAll());
		model.addAttribute("processors", processorService.findAll());
		model.addAttribute("videoadapters", videoadapterService.findAll());
		return "komputer";
	}
}
