package ua.form;

import ua.entity.TypeProcessor;
import ua.entity.ÑoreProcessor;

public class ProcessorForm {

	private int id;

	private ÑoreProcessor coreprocessor;

	private TypeProcessor typeprocessor;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ÑoreProcessor getCoreprocessor() {
		return coreprocessor;
	}

	public void setCoreprocessor(ÑoreProcessor coreprocessor) {
		this.coreprocessor = coreprocessor;
	}

	public TypeProcessor getTypeprocessor() {
		return typeprocessor;
	}

	public void setTypeprocessor(TypeProcessor typeprocessor) {
		this.typeprocessor = typeprocessor;
	}

	public String getName(ÑoreProcessor coreprocessor,
			TypeProcessor typeprocessor) {
		return name =  typeprocessor.getName() + ", "
				+ Integer.toString(coreprocessor.getCore());
	}

	public void setName(ÑoreProcessor coreprocessor, TypeProcessor typeprocessor) {

		this.name = typeprocessor.getName() + ", "
				+ Integer.toString(coreprocessor.getCore());
	}

}
