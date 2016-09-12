package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Ram;
import ua.form.RamForm;

public interface RamServiñe {


	List<Ram> findAll();

	RamForm findForForm(int id);

	void save(RamForm form);


	Ram findOne(Integer valueOf);

	void delete(int id);

	Page<Ram> findAll(Pageable pageable);

	void save(Ram ram);

}