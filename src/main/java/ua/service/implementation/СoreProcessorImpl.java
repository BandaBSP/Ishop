package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.�oreProcessor;
import ua.form.�oreProcessorForm;
import ua.repository.�oreProcessorRepository;
import ua.service.�oreProcessorService;

@Service
@Transactional
public class �oreProcessorImpl implements �oreProcessorService {

	@Autowired
	private �oreProcessorRepository coreprocessorRepository;

	@Override
	public void save(�oreProcessorForm form) {
		�oreProcessor coreprocessor = new �oreProcessor();
		coreprocessor.setId(form.getId());
		coreprocessor.setCore(Integer.parseInt(form.getCore()));
		coreprocessorRepository.save(coreprocessor);
	}

	@Override
	public void delete(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public List<�oreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public �oreProcessor findOne(Integer valueOf) {
		return coreprocessorRepository.findOne(valueOf);
	}

	@Override
	public �oreProcessorForm findForForm(int id) {
		�oreProcessor core = coreprocessorRepository.findOne(id);
		�oreProcessorForm forma = new �oreProcessorForm();
		forma.setId(core.getId());
		forma.setCore(String.valueOf(core.getCore()));
		return forma;
	}

	public �oreProcessor findOne(int id) {
		return coreprocessorRepository.findOne(id);
	}

	@Override
	public �oreProcessorForm findForForm(�oreProcessorForm form) {
		// TODO Auto-generated method stub
		return null;
	}

}
