package ua.service;

import java.util.List;

import ua.entity.Processor;
import ua.form.ProcessorForm;

public interface ProcessorService {

	
	
	void save(ProcessorForm form);


	ProcessorForm findForForm(int id);


	List<Processor> findAll();

	void delete(int id);
}
