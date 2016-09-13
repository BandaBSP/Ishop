package ua.form;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import ua.entity.Hdd;
import ua.entity.OpticalDrive;
import ua.entity.Processor;
import ua.entity.Ram;
import ua.entity.TypeProcessor;
import ua.entity.User;
import ua.entity.VideoAdapter;
import ua.entity.�oreProcessor;

public class KomputerForm {

	private int id;

	private Hdd hdd;

//	private OpticalDrive opticaldrive;

	private Ram ram;

	private VideoAdapter videoadapter;

	private Processor processor;

	private String price;

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setPrice(int parseInt) {
		// TODO Auto-generated method stub
		
	}


	
}