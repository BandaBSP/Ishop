package ua.service.implementation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.TypeProcessor;
import ua.service.TypeProcessorService;

public class TypeProcessorValidator implements Validator {

	private final TypeProcessorService typeprocessorService;

	public TypeProcessorValidator(TypeProcessorService typeprocessorService) {
		this.typeprocessorService = typeprocessorService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return TypeProcessor.class.equals(clazz);
	}
	
	

	@Override
	public void validate(Object target, Errors errors) {
		TypeProcessor form = (TypeProcessor) target;
		if(form.getId()==0)if(typeprocessorService.findByName(form.getName())!=null){
			errors.rejectValue("name", "", "TypeProcessor already exists");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can`t be empty");
	}
}
