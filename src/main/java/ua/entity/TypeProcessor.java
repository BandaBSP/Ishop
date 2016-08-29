package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeProcessor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "typeprocessor")
	private List<Processor> procesors = new ArrayList<Processor>();

	private String name;

	public TypeProcessor() {
		super();
	}

	public TypeProcessor(String tp) {
		this.name = tp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Processor> getProcesors() {
		return procesors;
	}

	public void setProcesors(List<Processor> procesors) {
		this.procesors = procesors;
	}


}
