package ua.service.implementation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Ram;
import ua.service.RamServiñe;

public class RamValidator implements Validator {

	private final RamServiñe ramService;

	public RamValidator(RamServiñe ramService) {
		this.ramService = ramService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Ram.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		Ram form = (Ram) target;
		if(form.getId()==0)if(ramService.findByName(Integer.toString(form.getRamGb()))!=null){
			errors.rejectValue("ramGb", "", "Country already exists");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ramGb", "", "Can`t be empty");
	}
}
