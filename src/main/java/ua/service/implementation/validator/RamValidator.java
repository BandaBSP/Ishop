package ua.service.implementation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Ram;
import ua.service.RamServiñe;

public class RamValidator implements Validator {

	private final RamServiñe ramService;
	private static final Pattern p = Pattern.compile("^[0-9]{1,2}$");

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
		if (form.getId() == 0)
			if (ramService.findByName(Integer.toString(form.getRamGb())) != null) {
				errors.rejectValue("ramGb", "", "Ram already exists");
			}
		Matcher m = p.matcher(Integer.toString(form.getRamGb()));
		if(!m.matches()){
			errors.rejectValue("ramGb", "", "ramGb format is 1 to 99");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ramGb", "",	"Can`t be empty");
	}
}
