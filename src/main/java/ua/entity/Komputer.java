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
public class Komputer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Hdd hdd;

	@ManyToOne(fetch = FetchType.LAZY)
	private OpticalDrive opticaldrive;

	@ManyToOne(fetch = FetchType.LAZY)
	private Ram ram;

	@ManyToOne(fetch = FetchType.LAZY)
	private VideoAdapter videoadapter;

	@ManyToOne(fetch = FetchType.LAZY)
	private Processor processor;

	@OneToMany(mappedBy = "komputer")
	private List<User> komputers = new ArrayList<User>();

	private int price;

	public Komputer() {
		super();
	}

	public Komputer(int id, Hdd hdd, OpticalDrive opticaldrive, Ram ram,
			VideoAdapter videoadapter, Processor processor,
			List<User> komputers, int price) {
		super();
		this.id = id;
		this.hdd = hdd;
		this.opticaldrive = opticaldrive;
		this.ram = ram;
		this.videoadapter = videoadapter;
		this.processor = processor;
		this.komputers = komputers;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	public OpticalDrive getOpticaldrive() {
		return opticaldrive;
	}

	public void setOpticaldrive(OpticalDrive opticaldrive) {
		this.opticaldrive = opticaldrive;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public VideoAdapter getVideoadapter() {
		return videoadapter;
	}

	public void setVideoadapter(VideoAdapter videoadapter) {
		this.videoadapter = videoadapter;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public List<User> getKomputers() {
		return komputers;
	}

	public void setKomputers(List<User> komputers) {
		this.komputers = komputers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
