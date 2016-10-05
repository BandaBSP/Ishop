package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Processor;
import ua.form.filter.ProcessorFilterForm;
import ua.repository.ProcessorRepository;
import ua.repository.TypeProcessorRepository;
import ua.repository.ÑoreProcessorRepository;
import ua.service.ProcessorService;
import ua.service.implementation.specification.ProcessorFilterAdapter;

@Service
@Transactional
public class ProcessorImpl implements ProcessorService {
	
	

	@Autowired
	private ProcessorRepository processorRepository;
	
	@Autowired
	private ÑoreProcessorRepository coreprocessorRepository;
	
	@Autowired
	private TypeProcessorRepository typeprocessorRepository;

	@Override
	public void save(Processor processor) {
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
	public Processor findOne(int id) {
		return processorRepository.findOne(id);
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
	public Processor findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

}