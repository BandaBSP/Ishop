package ua.service.implementation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.VideoAdapter;
import ua.service.VideoAdapterService;

public class VideoAdapterValidator implements Validator {

	private final VideoAdapterService videoadapterService;
	private static final Pattern p = Pattern.compile("^[a-z]{1,15}$");

	public VideoAdapterValidator(VideoAdapterService videoadapterService) {
		this.videoadapterService = videoadapterService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return VideoAdapter.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		VideoAdapter form = (VideoAdapter) target;
		if (form.getId() == 0)
			if (videoadapterService.findByName(form.getName()) != null) {
				errors.rejectValue("name", "", "VideoAdapter already exists");
			}
		Matcher m = p.matcher(form.getName());
		if(!m.matches()){
			errors.rejectValue("name", "", "name format is a-z ");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",
				"Can`t be empty");
	}
}
