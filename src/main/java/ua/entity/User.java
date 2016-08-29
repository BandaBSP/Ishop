package ua.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Komputer komputer;

	public User() {
		super();
	}

	public User(int id, String name, int price, Komputer komputer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.komputer = komputer;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Komputer getKomputer() {
		return komputer;
	}

	public void setKomputer(Komputer komputer) {
		this.komputer = komputer;
	}
	
	
}
