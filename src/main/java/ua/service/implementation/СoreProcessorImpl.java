package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.ÑoreProcessor;
import ua.form.ÑoreProcessorForm;
import ua.repository.ÑoreProcessorRepository;
import ua.service.ÑoreProcessorService;

@Service
@Transactional
public class ÑoreProcessorImpl implements ÑoreProcessorService {

	@Autowired
	private ÑoreProcessorRepository coreprocessorRepository;

	@Override
	public void save(ÑoreProcessorForm form) {
		ÑoreProcessor coreprocessor = new ÑoreProcessor();
		coreprocessor.setCore(Integer.parseInt(form.getCore()));
		coreprocessorRepository.save(coreprocessor);

	}

	@Override
	public void delete(int core) {
		coreprocessorRepository.delete(core);
	}

	@Override
	public List<ÑoreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public void deleteId(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public ÑoreProcessor findOne(Integer valueOf) {
		return coreprocessorRepository.findOne(valueOf);
	}

	@Override
	public ÑoreProcessorForm findForForm(ÑoreProcessorForm form) {
		ÑoreProcessor core = coreprocessorRepository.findOne(form);
		ÑoreProcessorForm forma = new ÑoreProcessorForm();
		forma.setId(core.getId());
		forma.setCore(String.valueOf(core.getCore()));
		return form;
	}

}
