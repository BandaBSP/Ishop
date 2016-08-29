package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class VideoAdapter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "videoadapter")
	private List<Komputer> komputers = new ArrayList<Komputer>();

	private String name;

	public VideoAdapter() {
		super();
	}

	public VideoAdapter(String va) {
		this.name = va;
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

	public List<Komputer> getKomputers() {
		return komputers;
	}

	public void setKomputers(List<Komputer> komputers) {
		this.komputers = komputers;
	}

}
