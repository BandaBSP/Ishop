package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.TypeProcessor;
import ua.form.TypeProcessorForm;
import ua.repository.TypeProcessorRepository;
import ua.service.TypeProcessorService;

@Service
@Transactional
public class TypeProcessorImpl implements TypeProcessorService {

	@Autowired
	private TypeProcessorRepository typeprocessorRepository;

	@Override
	public void save(TypeProcessorForm form) {
		TypeProcessor typeprocessor = new TypeProcessor();
		typeprocessor.setId(form.getId());
		typeprocessor.setName(form.getName());
		typeprocessorRepository.save(typeprocessor);
	}

	@Override
	public void delete(int id) {
		typeprocessorRepository.delete(id);
	}

	@Override
	public List<TypeProcessor> findAll() {
		return typeprocessorRepository.findAll();
	}

	@Override
	public TypeProcessor findOne(Integer valueOf) {
		return typeprocessorRepository.findOne(valueOf);
	}

	@Override
	public TypeProcessorForm findForForm(int id) {
		TypeProcessor name = typeprocessorRepository.findOne(id);
		TypeProcessorForm form = new TypeProcessorForm();
		form.setId(name.getId());
		form.setName(name.getName());
		return form;
	}

	public TypeProcessor findOne(int id) {
		return typeprocessorRepository.findOne(id);
	}

}
