package ua.service;

import java.util.List;

import ua.entity.TypeProcessor;
import ua.form.TypeProcessorForm;

public interface TypeProcessorService {

	void save(TypeProcessorForm form);

	void delete(int id);

	List<TypeProcessor> findAll();

	TypeProcessor findOne(Integer valueOf);

	TypeProcessorForm findForForm(int id);

	TypeProcessor findOne(int id);
}
