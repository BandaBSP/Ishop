package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Processor;
import ua.form.filter.ProcessorFilterForm;


public interface ProcessorService {

	void save(Processor processor);

	Processor findByName(String name);

	void delete(String name);

	List<Processor> findAll();

	void delete(int id);

	Processor findOne(int id);

	Page<Processor> findAll(Pageable pageable);

	Page<Processor> findAll(Pageable pageable, ProcessorFilterForm form);


}
