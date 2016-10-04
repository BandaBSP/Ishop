package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.Hdd;
import ua.form.filter.HddFilterForm;

public interface HddService {

	void save(Hdd hddGb);

	Hdd findByName(String hddGb);

	void delete(String hddGb);

	List<Hdd> findAll();

	void delete(int id);

	Hdd findOne(int id);

	Page<Hdd> findAll(Pageable pageable);

	Page<Hdd> findAll(Pageable pageable, HddFilterForm form);

}
