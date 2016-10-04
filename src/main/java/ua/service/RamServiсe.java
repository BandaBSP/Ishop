package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Ram;
import ua.form.filter.RamFilterForm;

public interface RamServiñe {
	
	void save(Ram ram);

	Ram findByName(String ramGb);

	void delete(String ramGb);

	List<Ram> findAll();

	void delete(int id);

	Ram findOne(int id);

	Page<Ram> findAll(Pageable pageable);

	Page<Ram> findAll(Pageable pageable, RamFilterForm form);
}