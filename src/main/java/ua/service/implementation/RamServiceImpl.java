package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Ram;
import ua.form.RamForm;
import ua.repository.RamRepository;
import ua.service.RamServiñe;

@Service
@Transactional
public class RamServiceImpl implements RamServiñe {

	@Autowired
	private RamRepository RamRepository;

	@Override
	public void save(RamForm form) {
		Ram ram = new Ram();
		ram.setId(form.getId());
		ram.setRamGb(Integer.parseInt(form.getRamGb()));
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

	@Override
	public RamForm findForForm(int id) {
		Ram ram = RamRepository.findOne(id);
		RamForm forma = new RamForm();
		forma.setId(ram.getId());
		forma.setRamGb(String.valueOf(ram.getRamGb()));
		return forma;
	}

}
