package ua.service;

import java.util.List;

import ua.entity.Ram;


public interface RamServi�e {

	void save(int ramGb);
	
	void delete(int ramGb);
	
	List<Ram> findAll();

	void deleteId(int id);
}