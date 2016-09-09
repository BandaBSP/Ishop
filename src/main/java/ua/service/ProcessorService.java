package ua.service;

import java.util.List;

import ua.entity.Processor;
import ua.form.ProcessorForm;

public interface ProcessorService {

	void save(ProcessorForm form);

	ProcessorForm findForForm(int id);

	void delete(int id);

	Processor findOne(Integer valueOf);

	List<Processor> findAll();

}
