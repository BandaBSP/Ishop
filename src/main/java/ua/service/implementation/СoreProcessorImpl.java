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
		coreprocessor.setId(form.getId());
		coreprocessor.setCore(Integer.parseInt(form.getCore()));
		coreprocessorRepository.save(coreprocessor);
	}

	@Override
	public void delete(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public List<ÑoreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public ÑoreProcessor findOne(Integer valueOf) {
		return coreprocessorRepository.findOne(valueOf);
	}

	@Override
	public ÑoreProcessorForm findForForm(int id) {
		ÑoreProcessor core = coreprocessorRepository.findOne(id);
		ÑoreProcessorForm forma = new ÑoreProcessorForm();
		forma.setId(core.getId());
		forma.setCore(String.valueOf(core.getCore()));
		return forma;
	}

	public ÑoreProcessor findOne(int id) {
		return coreprocessorRepository.findOne(id);
	}

	@Override
	public ÑoreProcessorForm findForForm(ÑoreProcessorForm form) {
		// TODO Auto-generated method stub
		return null;
	}

}
