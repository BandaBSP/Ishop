package ua.service;

import java.util.List;

import ua.entity.Hdd;
import ua.form.HddForm;

public interface HddService {

	List<Hdd> findAll();

	HddForm findForForm(int id);

	void save(HddForm form);

	void delete(int id);

	Hdd findOne(Integer valueOf);

}
