package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Processor;
import ua.form.ProcessorForm;
import ua.form.filter.ProcessorFilterForm;


public interface ProcessorService {

	List<Processor> findAll();

	void delete(int id);

	void save(ProcessorForm form);

	Page<Processor> findAll(Pageable pageable);

	Page<Processor> findAll(Pageable pageable, ProcessorFilterForm form);

	ProcessorForm findOneForForm(int id);

	Processor findOne(Integer valueOf);



}
