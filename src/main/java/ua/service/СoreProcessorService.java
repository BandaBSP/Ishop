package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.ÑoreProcessor;
import ua.form.filter.ÑoreProcessorFilterForm;


public interface ÑoreProcessorService {

	void save(ÑoreProcessor typeprocessor);

	ÑoreProcessor findByName(String core);

	void delete(String core);

	List<ÑoreProcessor> findAll();

	void delete(int id);

	ÑoreProcessor findOne(int id);

	Page<ÑoreProcessor> findAll(Pageable pageable);

	Page<ÑoreProcessor> findAll(Pageable pageable, ÑoreProcessorFilterForm form);


}
