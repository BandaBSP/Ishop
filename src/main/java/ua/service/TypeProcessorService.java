package ua.service;

import java.util.List;

import ua.entity.TypeProcessor;

public interface TypeProcessorService {

	void save(String name);

	TypeProcessor findByName(String name);

	void delete(String name);

	List<TypeProcessor> findAll();

	void delete(int id);
}
