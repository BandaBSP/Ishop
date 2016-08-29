package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.TypeProcessor;
import ua.repository.TypeProcessorRepository;
import ua.service.TypeProcessorService;

@Service
@Transactional
public class TypeProcessorImpl implements TypeProcessorService {

	@Autowired
	private TypeProcessorRepository typeprocessorRepository;

	@Override
	public void save(String name) {
		TypeProcessor typeprocessor = new TypeProcessor();
		typeprocessor.setName(name);
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

}
