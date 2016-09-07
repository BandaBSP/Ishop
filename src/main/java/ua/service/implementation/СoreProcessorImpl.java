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
		coreprocessor.setCore(Integer.parseInt(form.getCore()));
		coreprocessorRepository.save(coreprocessor);

	}

	@Override
	public void delete(int core) {
		coreprocessorRepository.delete(core);
	}

	@Override
	public List<�oreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public void deleteId(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public �oreProcessor findOne(Integer valueOf) {
		return coreprocessorRepository.findOne(valueOf);
	}

	@Override
	public �oreProcessorForm findForForm(�oreProcessorForm form) {
		�oreProcessor core = coreprocessorRepository.findOne(form);
		�oreProcessorForm forma = new �oreProcessorForm();
		forma.setId(core.getId());
		forma.setCore(String.valueOf(core.getCore()));
		return form;
	}

}
