package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(indexes = { @Index(columnList = "core") })
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ÑoreProcessor other = (ÑoreProcessor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
