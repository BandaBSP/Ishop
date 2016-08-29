package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ÑoreProcessor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int core;
	@OneToMany(mappedBy = "coreprocessor")
	private List<Processor> procesors = new ArrayList<Processor>();

	public ÑoreProcessor() {
		super();
	}

	public ÑoreProcessor(int id, int core, List<Processor> procesors) {
		super();
		this.id = id;
		this.core = core;
		this.procesors = procesors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCore() {
		return core;
	}

	public void setCore(int core) {
		this.core = core;
	}

	public List<Processor> getProcesors() {
		return procesors;
	}

	public void setProcesors(List<Processor> procesors) {
		this.procesors = procesors;
	}

}
