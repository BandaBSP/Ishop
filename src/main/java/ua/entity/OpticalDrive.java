package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OpticalDrive {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "opticaldrive")
	private List<Komputer> komputers = new ArrayList<Komputer>();

	private boolean OpticalDrive;

	public List<Komputer> getKomputers() {
		return komputers;
	}

	public void setKomputers(List<Komputer> komputers) {
		this.komputers = komputers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isOpticalDrive() {
		return OpticalDrive;
	}

	public void setOpticalDrive(boolean opticalDrive) {
		OpticalDrive = opticalDrive;
	}

}
