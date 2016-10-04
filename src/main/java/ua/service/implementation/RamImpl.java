package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Ram;
import ua.form.filter.RamFilterForm;
import ua.repository.RamRepository;
import ua.service.RamServi�e;
import ua.service.implementation.specification.RamFilterAdapter;

@Service
@Transactional
public class RamImpl implements RamServi�e {

	@Autowired
	private RamRepository ramGbRepository;

	@Override
	public void save(Ram ram) {
		ramGbRepository.save(ram);
	}

//	@Override
//	public Ram findByName(String ramGb) {
//		return ramGbRepository.findByName(ramGb);
//	}
//
//	@Override
//	public void delete(String ramGb) {
//		ramGbRepository.delete(ramGb);
//	}

	@Override
	public List<Ram> findAll() {
		return ramGbRepository.findAll();
	}

	@Override
	public void delete(int id) {
		ramGbRepository.delete(id);
	}

	@Override
	public Ram findOne(int id) {
		return ramGbRepository.findOne(id);
	}

	@Override
	public Page<Ram> findAll(Pageable pageable) {
		return ramGbRepository.findAll(pageable);
	}


	@Override
	public Page<Ram> findAll(Pageable pageable, RamFilterForm form) {
		return ramGbRepository.findAll(new RamFilterAdapter(form), pageable);
	}

	@Override
	public Ram findByName(String ramGb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String ramGb) {
		// TODO Auto-generated method stub
		
	}
}