package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Hdd;
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
	public void save(Hdd hddGb) {
		hddGbRepository.save(hddGb);
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
	public Hdd findOne(int id) {
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
}