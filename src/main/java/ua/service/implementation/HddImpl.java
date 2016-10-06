package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Hdd;
import ua.form.HddForm;
import ua.form.filter.HddFilterForm;
import ua.repository.HddRepository;
import ua.service.HddService;
import ua.service.implementation.specification.HddFilterAdapter;

@Service
@Transactional
public class HddImpl implements HddService {

	@Autowired
	private HddRepository hddGbRepository;

	@Override
	public void save(HddForm form) {
		Hdd entity = new Hdd();
		entity.setHddGb(Integer.valueOf(form.getHddGb()));
		entity.setTypeHdd(form.getTypeHdd());
		entity.setId(form.getId());
		hddGbRepository.save(entity);
	}

//	@Override
//	public Hdd findByName(String hddGb) {
//		return hddGbRepository.findByName(hddGb);
//	}
//
//	@Override
//	public void delete(String hddGb) {
//		hddGbRepository.delete(hddGb);
//	}

	@Override
	public List<Hdd> findAll() {
		return hddGbRepository.findAll();
	}

	@Override
	public void delete(int id) {
		hddGbRepository.delete(id);
	}

	@Override
	public Hdd findOne1(int id) {
		return hddGbRepository.findOne(id);
	}

	@Override
	public Page<Hdd> findAll(Pageable pageable) {
		return hddGbRepository.findAll(pageable);
	}


	@Override
	public Page<Hdd> findAll(Pageable pageable, HddFilterForm form) {
		return hddGbRepository.findAll(new HddFilterAdapter(form), pageable);
	}

	@Override
	public Hdd findByName(String hddGb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String hddGb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HddForm findOne(int id) {
		Hdd entity = hddGbRepository.findOne(id);
		HddForm form = new HddForm();
		form.setHddGb(String.valueOf(entity.getHddGb()));
		form.setTypeHdd(entity.getTypeHdd());
		form.setId(entity.getId());
		return form;
	}

}