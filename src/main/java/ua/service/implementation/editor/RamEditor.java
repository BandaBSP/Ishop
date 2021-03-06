package ua.service.implementation.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Ram;
import ua.service.RamServiņe;

public class RamEditor extends PropertyEditorSupport {

	private final RamServiņe ramServiņe;

	public RamEditor(RamServiņe ramServiņe) {
		this.ramServiņe = ramServiņe;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Ram ram = ramServiņe.findOne1(Integer.valueOf(text));
		setValue(ram);
	}
}