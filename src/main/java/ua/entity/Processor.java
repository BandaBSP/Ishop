package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Processor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	private ÑoreProcessor coreprocessor;

	@ManyToOne(fetch = FetchType.LAZY)
	private TypeProcessor typeprocessor;

	@OneToMany(mappedBy = "processor")
	private List<Komputer> komputers = new ArrayList<Komputer>();

	public Processor() {
		super();
	}

	public Processor(int id, ÑoreProcessor coreprocessor,
			TypeProcessor typeprocessor, List<Komputer> komputers) {
		super();
		this.id = id;
		this.coreprocessor = coreprocessor;
		this.typeprocessor = typeprocessor;
		this.komputers = komputers;
	}

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

	public List<Komputer> getKomputers() {
		return komputers;
	}

	public void setKomputers(List<Komputer> komputers) {
		this.komputers = komputers;
	}

}
