package ua.service;

import java.util.List;

import ua.entity.�oreProcessor;

public interface �oreProcessorService {

	void save(int core);

	�oreProcessor findOne1(int core);

	void delete1(int core);

	List<�oreProcessor> findAll();

	void delete(int id);

	�oreProcessor findOne(int core);
}
