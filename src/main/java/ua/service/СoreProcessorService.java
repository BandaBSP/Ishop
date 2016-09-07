package ua.service;

import java.util.List;

import ua.entity.�oreProcessor;
import ua.form.�oreProcessorForm;

public interface �oreProcessorService {

void save(�oreProcessorForm form);
	
	void delete(int core);
	
	List<�oreProcessor> findAll();

	void deleteId(int id);

	�oreProcessor findOne(Integer valueOf);

	�oreProcessorForm findForForm(�oreProcessorForm form);
}
