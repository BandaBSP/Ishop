package ua.service.implementation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.�oreProcessor;
import ua.service.�oreProcessorService;

public class �oreProcessorValidator implements Validator {

	private final �oreProcessorService coreprocessorService;

	public �oreProcessorValidator(�oreProcessorService coreprocessorService) {
		this.coreprocessorService = coreprocessorService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return �oreProcessor.class.equals(clazz);
	}
	
	

	@Override
	public void validate(Object target, Errors errors) {
		�oreProcessor form = (�oreProcessor) target;
		if(form.getId()==0)if(coreprocessorService.findOne((form.getCore()))!=null){
			errors.rejectValue("core", "", "�oreProcessor already exists");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "core", "", "Can`t be empty");
	}
}
