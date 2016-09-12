package ua.service.implementation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Processor;
import ua.entity.TypeProcessor;
import ua.entity.ÑoreProcessor;
import ua.form.ProcessorForm;
import ua.repository.ProcessorRepository;
import ua.repository.TypeProcessorRepository;
import ua.repository.ÑoreProcessorRepository;
import ua.service.ProcessorService;

@Service
@Transactional
public class ProcessorImpl implements ProcessorService {

	@Resource
	private ProcessorRepository processorRepository;

	@Autowired
	private ÑoreProcessorRepository coreprocessorRepository;

	@Autowired
	private TypeProcessorRepository typeprocessorRepository;


	@Override
	public void save(ProcessorForm form) {
		Processor processor = new Processor(new ÑoreProcessor(),
				new TypeProcessor());
		processor.setName(form.getName());
		processor.setCoreprocessor(form.getCoreprocessor());
		processor.setTypeprocessor(form.getTypeprocessor());
		processor.setId(form.getId());
		processorRepository.save(processor);

	}

	@Override
	public List<Processor> findAll() {
		return processorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		processorRepository.delete(id);
	}

	@Override
	public ProcessorForm findForForm(int id) {
		ProcessorForm form = new ProcessorForm();
		form.setName(form.getName(form.getCoreprocessor(),form.getTypeprocessor()));
		form.setId(form.getId());
		form.setTypeprocessor(form.getTypeprocessor());
		form.setCoreprocessor(form.getCoreprocessor());
		return form;
	}

	@Override
	public Processor findOne(Integer valueOf) {
		return processorRepository.findOne(valueOf);
	}

}
