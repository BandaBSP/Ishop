package ua.service.implementation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.form.ÑoreProcessorForm;
import ua.service.ÑoreProcessorService;

public class ÑoreProcessorFormValidator implements Validator{
	
	private final ÑoreProcessorService coreprocessorService;
	
	private static final Pattern p = Pattern.compile("^[0-9]{2,2}$");
	
	public ÑoreProcessorFormValidator(ÑoreProcessorService coreprocessorService) {
		this.coreprocessorService = coreprocessorService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return ÑoreProcessorForm.class.equals(clazz);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void validate(Object target, Errors errors) {
//		ÑoreProcessorForm form = (ÑoreProcessorForm) target;
//		if(form.getId()==0)if(coreprocessorService.findByName(form.getName())!=null){
//			errors.rejectValue("name", "", "Recipe already exists");
//		}
//		Matcher m = p.matcher(form.getTime());
//		if(!m.matches()){
//			errors.rejectValue("time", "", "Time format is hh:mm:ss");
//		}
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can`t be empty");
//	}
 }
