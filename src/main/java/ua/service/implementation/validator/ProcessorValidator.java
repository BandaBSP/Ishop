package ua.service.implementation.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ua.entity.Processor;
import ua.service.ProcessorService;

public class ProcessorValidator implements Validator {

	private final ProcessorService processorService;
	private static final Pattern p = Pattern.compile("^[a-z]{1,15}$");

	public ProcessorValidator(ProcessorService processorService) {
		this.processorService = processorService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Processor.class.equals(clazz);
	}
	
	

	@Override
	public void validate(Object target, Errors errors) {
		Processor form = (Processor) target;
		/*if(form.getId()==0)if(processorService.findByName(form.getName())!=null){
			errors.rejectValue("name", "", "Processor already exists");
		}*/
//		Matcher m = p.matcher(form.getName());
//		if(!m.matches()){
//			errors.rejectValue("name", "", "name format is a-z ");
//		}
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can`t be empty");
	}
}
