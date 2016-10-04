package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.�oreProcessor;
import ua.form.filter.�oreProcessorFilterForm;


public interface �oreProcessorService {

	void save(�oreProcessor typeprocessor);

	�oreProcessor findByName(String core);

	void delete(String core);

	List<�oreProcessor> findAll();

	void delete(int id);

	�oreProcessor findOne(int id);

	Page<�oreProcessor> findAll(Pageable pageable);

	Page<�oreProcessor> findAll(Pageable pageable, �oreProcessorFilterForm form);


}
