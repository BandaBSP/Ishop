package ua.service.implementation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.ÑoreProcessor;
import ua.service.ÑoreProcessorService;

public class ÑoreProcessorValidator implements Validator {

	private final ÑoreProcessorService coreprocessorService;
	private static final Pattern p = Pattern.compile("^[0-9]{1,2}$");

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
		if(form.getId()==0)if(coreprocessorService.findByName(Integer.toString(form.getCore()))!=null){
			errors.rejectValue("core", "", "ÑoreProcessor already exists");
		}
		Matcher m = p.matcher(Integer.toString(form.getCore()));
		if(!m.matches()){
			errors.rejectValue("core", "", "core format is 1 to 99");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "core", "", "Can`t be empty");
	}
}
