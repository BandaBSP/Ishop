package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ram {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "ram")
	private List<Komputer> komputers = new ArrayList<Komputer>();

	private int ramGb;

	public Ram() {
		super();
	}

	public Ram(int ram) {
		this.ramGb = ram;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRamGb() {
		return ramGb;
	}

	public void setRamGb(int ramGb) {
		this.ramGb = ramGb;
	}

	public List<Komputer> getKomputers() {
		return komputers;
	}

	public void setKomputers(List<Komputer> komputers) {
		this.komputers = komputers;
	}

}
