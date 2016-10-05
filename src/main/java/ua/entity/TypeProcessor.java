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
@Table(indexes = { @Index(columnList = "name") })
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
		TypeProcessor other = (TypeProcessor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
