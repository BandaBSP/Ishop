package ua.service.implementation.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Hdd;
import ua.service.HddService;

public class HddEditor extends PropertyEditorSupport {

	private final HddService hddService;

	public HddEditor(HddService hddService) {
		this.hddService = hddService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Hdd hdd = hddService.findOne(Integer
				.valueOf(text));
		setValue(hdd);
	}
}