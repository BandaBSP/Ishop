package ua.service.implementation.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Komputer;
import ua.service.KomputerService;

public class KomputerEditor extends PropertyEditorSupport {

	private final KomputerService komputerService;

	public KomputerEditor(KomputerService komputerService) {
		this.komputerService = komputerService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Komputer komputer = komputerService.findOne(Integer.valueOf(text));
		setValue(komputer);
	}
}