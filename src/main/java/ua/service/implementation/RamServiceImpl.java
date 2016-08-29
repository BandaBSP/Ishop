package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Ram;
import ua.repository.RamRepository;
import ua.service.RamServiñe;

@Service
@Transactional
public class RamServiceImpl implements RamServiñe {

	
	@Autowired
	private RamRepository RamRepository;

	@Override
	public void save(int ramGb) {
		Ram ram = new Ram();
		ram.setRamGb(ramGb);
		RamRepository.save(ram);
	}

	@Override
	public void delete(int ramGb) {
		RamRepository.delete(ramGb);
	}

	@Override
	public List<Ram> findAll() {
		return RamRepository.findAll();
	}

	@Override
	public void deleteId(int id) {
		RamRepository.delete(id);
	}

	


}
