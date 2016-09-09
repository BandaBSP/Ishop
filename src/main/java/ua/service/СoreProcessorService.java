package ua.service;

import java.util.List;

import ua.entity.ÑoreProcessor;
import ua.form.ÑoreProcessorForm;

public interface ÑoreProcessorService {


	void delete(int core);

	List<ÑoreProcessor> findAll();

	ÑoreProcessor findOne(Integer valueOf);

	ÑoreProcessorForm findForForm(ÑoreProcessorForm form);

	ÑoreProcessor findOne(int id);

	void save(ÑoreProcessorForm form);

	ÑoreProcessorForm findForForm(int id);
}
