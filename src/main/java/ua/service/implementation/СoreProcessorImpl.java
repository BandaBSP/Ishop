package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.ÑoreProcessor;
import ua.form.filter.ÑoreProcessorFilterForm;
import ua.repository.ÑoreProcessorRepository;
import ua.service.ÑoreProcessorService;
import ua.service.implementation.specification.ÑoreProcessorFilterAdapter;

@Service
@Transactional
public class ÑoreProcessorImpl implements ÑoreProcessorService {

	@Autowired
	private ÑoreProcessorRepository coreprocessorRepository;

	@Override
	public void save(ÑoreProcessor coreprocessor) {
		coreprocessorRepository.save(coreprocessor);
	}

//	@Override
//	public ÑoreProcessor findByName(String name) {
//		return coreprocessorRepository.findByName(name);
//	}

//	@Override
//	public void delete(String name) {
//		coreprocessorRepository.delete(name);
//	}

	@Override
	public List<ÑoreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public ÑoreProcessor findOne(int id) {
		return coreprocessorRepository.findOne(id);
	}

	@Override
	public Page<ÑoreProcessor> findAll(Pageable pageable) {
		return coreprocessorRepository.findAll(pageable);
	}


	@Override
	public Page<ÑoreProcessor> findAll(Pageable pageable, ÑoreProcessorFilterForm form) {
		return coreprocessorRepository.findAll((new ÑoreProcessorFilterAdapter(form)), pageable);
	}

	@Override
	public ÑoreProcessor findByName(String core) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String core) {
		// TODO Auto-generated method stub
		
	}

	
}