package ua.service;

import java.util.List;

import ua.entity.ÑoreProcessor;
import ua.form.ÑoreProcessorForm;

public interface ÑoreProcessorService {

void save(int core);
	
	void delete(int core);
	
	List<ÑoreProcessor> findAll();

	void deleteId(int id);

	ÑoreProcessor findOne(Integer valueOf);

	ÑoreProcessorForm findForForm(int id);
}
