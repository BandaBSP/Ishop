package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Processor;
import ua.entity.TypeProcessor;
import ua.entity.ÑoreProcessor;
import ua.repository.ProcessorRepository;
import ua.service.ProcessorService;

@Service
@Transactional
public class ProcessorImpl implements ProcessorService {

	@Autowired
	private ProcessorRepository processorRepository;

	@Override
	public void save(Processor processor) {///////////////////////////////
		
		processor.setTypeprocessor(new TypeProcessor());
		processor.setCoreprocessor(new ÑoreProcessor());
		processorRepository.save(processor);
	}

	@Override
	public Processor findByName(String name) {
		return processorRepository.findByName(name);
	}

	@Override
	public void delete(String name) {
		processorRepository.delete(name);
	}

	@Override
	public List<Processor> findAll() {
		return processorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		processorRepository.delete(id);
	}

}
