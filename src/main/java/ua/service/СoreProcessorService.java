package ua.service;

import java.util.List;

import ua.entity.ÑoreProcessor;

public interface ÑoreProcessorService {

	void save(int core);

	ÑoreProcessor findOne1(int core);

	void delete1(int core);

	List<ÑoreProcessor> findAll();

	void delete(int id);

	ÑoreProcessor findOne(int core);
}
