package ua.service.implementation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.ÑoreProcessor;
import ua.service.ÑoreProcessorService;

public class ÑoreProcessorValidator implements Validator {

	private final ÑoreProcessorService coreprocessorService;

	public ÑoreProcessorValidator(ÑoreProcessorService coreprocessorService) {
		this.coreprocessorService = coreprocessorService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return ÑoreProcessor.class.equals(clazz);
	}
	
	

	@Override
	public void validate(Object target, Errors errors) {
		ÑoreProcessor form = (ÑoreProcessor) target;
		if(form.getId()==0)if(coreprocessorService.findOne((form.getCore()))!=null){
			errors.rejectValue("core", "", "ÑoreProcessor already exists");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "core", "", "Can`t be empty");
	}
}
