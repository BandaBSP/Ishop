package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.ÑoreProcessor;
import ua.repository.ÑoreProcessorRepository;
import ua.service.ÑoreProcessorService;

@Service
@Transactional
public class ÑoreProcessorImpl implements ÑoreProcessorService {

	@Autowired
	private ÑoreProcessorRepository coreprocessorRepository;

	@Override
	public void save(int core) {
		ÑoreProcessor coreprocessor = new ÑoreProcessor();
		coreprocessor.setCore(core);
		coreprocessorRepository.save(coreprocessor);
	}

	@Override
	public List<ÑoreProcessor> findAll() {
		return coreprocessorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		coreprocessorRepository.delete(id);
	}

	@Override
	public void delete1(int core) {
		coreprocessorRepository.delete(core);

	}

	@Override
	public ÑoreProcessor findOne1(int core) {
		return coreprocessorRepository.findOne(core);
	}

	@Override
	public ÑoreProcessor findOne(int core) {
		// TODO Auto-generated method stub
		return null;
	}

}
