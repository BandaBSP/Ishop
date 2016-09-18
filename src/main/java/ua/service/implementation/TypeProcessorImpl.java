package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.TypeProcessor;
import ua.form.filter.TypeProcessorFilterForm;
import ua.repository.TypeProcessorRepository;
import ua.service.TypeProcessorService;
import ua.service.implementation.specification.TypeProcessorFilterAdapter;

@Service
@Transactional
public class TypeProcessorImpl implements TypeProcessorService {

	@Autowired
	private TypeProcessorRepository typeprocessorRepository;

	@Override
	public void save(TypeProcessor typeprocessor) {
		typeprocessorRepository.save(typeprocessor);
	}

	@Override
	public TypeProcessor findByName(String name) {
		return typeprocessorRepository.findByName(name);
	}

	@Override
	public void delete(String name) {
		typeprocessorRepository.delete(name);
	}

	@Override
	public List<TypeProcessor> findAll() {
		return typeprocessorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		typeprocessorRepository.delete(id);
	}

	@Override
	public TypeProcessor findOne(int id) {
		return typeprocessorRepository.findOne(id);
	}

	@Override
	public Page<TypeProcessor> findAll(Pageable pageable) {
		return typeprocessorRepository.findAll(pageable);
	}


	@Override
	public Page<TypeProcessor> findAll(Pageable pageable, TypeProcessorFilterForm form) {
		return typeprocessorRepository.findAll(new TypeProcessorFilterAdapter(form), pageable);
	}
}