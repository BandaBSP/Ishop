package ua.service.implementation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.�oreProcessor;
import ua.service.�oreProcessorService;

public class �oreProcessorValidator implements Validator {

	private final �oreProcessorService coreprocessorService;
	private static final Pattern p = Pattern.compile("^[0-9]{1,2}$");

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
		if(form.getId()==0)if(coreprocessorService.findByName(Integer.toString(form.getCore()))!=null){
			errors.rejectValue("core", "", "�oreProcessor already exists");
		}
		Matcher m = p.matcher(Integer.toString(form.getCore()));
		if(!m.matches()){
			errors.rejectValue("core", "", "core format is 1 to 99");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "core", "", "Can`t be empty");
	}
}
