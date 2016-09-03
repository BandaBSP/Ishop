package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.�oreProcessor;
import ua.repository.�oreProcessorRepository;
import ua.service.�oreProcessorService;

@Service
@Transactional
public class �oreProcessorImpl implements �oreProcessorService {

	@Autowired
	private �oreProcessorRepository coreprocessorRepository;

	@Override
	public void save(int core) {
		�oreProcessor coreprocessor = new �oreProcessor();
		coreprocessor.setCore(core);
		coreprocessorRepository.save(coreprocessor);
	}

	@Override
	public List<�oreProcessor> findAll() {
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
	public �oreProcessor findOne1(int core) {
		return coreprocessorRepository.findOne(core);
	}

	@Override
	public �oreProcessor findOne(int core) {
		// TODO Auto-generated method stub
		return null;
	}

}
