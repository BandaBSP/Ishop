package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.�oreProcessor;
import ua.form.filter.�oreProcessorFilterForm;
import ua.repository.�oreProcessorRepository;
import ua.service.�oreProcessorService;
import ua.service.implementation.specification.�oreProcessorFilterAdapter;

@Service
@Transactional
public class �oreProcessorImpl implements �oreProcessorService {

	@Autowired
	private �oreProcessorRepository coreprocessorRepository;

	@Override
	public void save(�oreProcessor coreprocessor) {
		coreprocessorRepository.save(coreprocessor);
	}

	@Override
	public �oreProcessor findByName(String core) {
			return coreprocessorRepository.findOne(Integer.valueOf(core));
	}
//
//	@Override
//	public void delete(String core) {
//		coreprocessorRepository.delete(core);
//	}

	@Override
	public List<�oreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public �oreProcessor findOne(int id) {
		return coreprocessorRepository.findOne(id);
	}

	@Override
	public Page<�oreProcessor> findAll(Pageable pageable) {
		return coreprocessorRepository.findAll(pageable);
	}


	@Override
	public Page<�oreProcessor> findAll(Pageable pageable, �oreProcessorFilterForm form) {
		return coreprocessorRepository.findAll(new �oreProcessorFilterForm form, pageable);
	}



	@Override
	public void delete(String core) {
		// TODO Auto-generated method stub
		
	}

}