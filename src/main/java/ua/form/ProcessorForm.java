package ua.form;

import ua.entity.TypeProcessor;
import ua.entity.�oreProcessor;

public class ProcessorForm {

	private int id;
	
	private �oreProcessor coreprocessor;
	
	private TypeProcessor typeprocessor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public �oreProcessor getCoreprocessor() {
		return coreprocessor;
	}

	public void setCoreprocessor(�oreProcessor coreprocessor) {
		this.coreprocessor = coreprocessor;
	}

	public TypeProcessor getTypeprocessor() {
		return typeprocessor;
	}

	public void setTypeprocessor(TypeProcessor typeprocessor) {
		this.typeprocessor = typeprocessor;
	}
}
