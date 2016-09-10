package ua.service;

import java.util.List;

import ua.entity.Ram;
import ua.form.RamForm;

public interface RamServiñe {


	void delete(int ramGb);

	List<Ram> findAll();

	void deleteId(int id);

	void save(RamForm form);

	RamForm findForForm(int id);

	Ram findOne(Integer valueOf);

}