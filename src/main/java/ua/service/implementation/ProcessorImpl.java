package ua.service.implementation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Processor;
import ua.entity.TypeProcessor;
import ua.entity.ÑoreProcessor;
import ua.form.ProcessorForm;
import ua.form.filter.ProcessorFilterForm;
import ua.repository.ProcessorRepository;
import ua.repository.TypeProcessorRepository;
import ua.repository.ÑoreProcessorRepository;
import ua.service.ProcessorService;
import ua.service.implementation.specification.ProcessorFilterAdapter;

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
	public List<Processor> findAll() {
		return processorRepository.findAll();
	}
	@Override
	public void delete(int id) {
		processorRepository.delete(id);
	}

	@Override
	public void save(ProcessorForm form) {
		ÑoreProcessor coreprocessor = form.getCoreprocessor();
		TypeProcessor typeprocessor = form.getTypeprocessor();
		Processor processor = new Processor();
		processor.setCoreprocessor(coreprocessor);
		processor.setTypeprocessor(typeprocessor);
		processorRepository.save(processor);
	}
	@Override
	public Page<Processor> findAll(Pageable pageable) {
		return processorRepository.findAll(pageable);
	}
	@Override
	public Page<Processor> findAll(Pageable pageable, ProcessorFilterForm form) {
		return processorRepository.findAll(new ProcessorFilterAdapter(form), pageable);
	}
	@Override
	public ProcessorForm findOneForForm(int id) {
		Processor ai = processorRepository.findForForm(id);
		ProcessorForm form = new ProcessorForm();
		form.setId(id);
		form.setCoreprocessor(ai.getCoreprocessor());
		form.setTypeprocessor(ai.getTypeprocessor());
		return form;
	}
	@Override
	public Processor findOne(Integer valueOf) {
		// TODO Auto-generated method stub
		return null;
	}
}
