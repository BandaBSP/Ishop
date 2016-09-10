package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Hdd;
import ua.form.HddForm;
import ua.repository.HddRepository;
import ua.service.HddService;

@Service
@Transactional
public class HddImpl implements HddService {

	@Autowired
	private HddRepository hddRepository;

	@Override
	public void save(HddForm form) {
		Hdd hdd = new Hdd();
		hdd.setId(form.getId());
		hdd.setTypeHdd(form.getTypeHdd());
		hdd.setHddGb(Integer.parseInt(form.getHddGb()));
		hddRepository.save(hdd);

	}

	@Override
	public void delete(int id) {
		hddRepository.delete(id);
	}

	@Override
	public List<Hdd> findAll() {
		return hddRepository.findAll();
	}

	@Override
	public Hdd findOne(Integer valueOf) {
		return hddRepository.findOne(valueOf);
	}

	@Override
	public HddForm findForForm(int id) {
		Hdd hdd = hddRepository.findOne(id);
		HddForm form = new HddForm();
		form.setTypeHdd(hdd.getTypeHdd());
		form.setId(hdd.getId());
		form.setHddGb(String.valueOf(hdd.getHddGb()));
		return form;
	}
}
