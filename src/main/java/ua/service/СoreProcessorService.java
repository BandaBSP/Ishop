package ua.service;

import java.util.List;

import ua.entity.ÑoreProcessor;
import ua.form.ÑoreProcessorForm;

public interface ÑoreProcessorService {

void save(ÑoreProcessorForm form);
	
	void delete(int core);
	
	List<ÑoreProcessor> findAll();

	void deleteId(int id);

	ÑoreProcessor findOne(Integer valueOf);

	ÑoreProcessorForm findForForm(ÑoreProcessorForm form);
}
