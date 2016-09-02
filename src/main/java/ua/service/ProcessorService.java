package ua.service;

import java.util.List;

import ua.entity.Processor;

public interface ProcessorService {

	void save(Processor processor);

	Processor findByName(String name);

	void delete(String name);

	List<Processor> findAll();

	void delete(int id);
}
