package ua.service.implementation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Processor;
import ua.service.ProcessorService;

public class ProcessorValidator implements Validator {

	private final ProcessorService processorService;

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
//		if(form.getId()==0)if(processorService.findByName(form.getTypeprocessor())!=null){
//			errors.rejectValue("typeprocessor", "", "Processor already exists");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "typeprocessor", "", "Can`t be empty");
	}
}
