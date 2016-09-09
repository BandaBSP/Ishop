package ua.service;

import java.util.List;

import ua.entity.�oreProcessor;
import ua.form.�oreProcessorForm;

public interface �oreProcessorService {


	void delete(int core);

	List<�oreProcessor> findAll();

	�oreProcessor findOne(Integer valueOf);

	�oreProcessorForm findForForm(�oreProcessorForm form);

	�oreProcessor findOne(int id);

	void save(�oreProcessorForm form);

	�oreProcessorForm findForForm(int id);
}
