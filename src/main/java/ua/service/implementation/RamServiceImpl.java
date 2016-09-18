package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Ram;
import ua.form.RamForm;
import ua.form.filter.RamFilterForm;
import ua.repository.RamRepository;
import ua.service.RamServiñe;
import ua.service.implementation.specification.RamFilterAdapter;

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
	public void delete(int id) {
		RamRepository.delete(id);
	}

	@Override
	public List<Ram> findAll() {
		return RamRepository.findAll();
	}

	@Override
	public RamForm findForForm(int id) {
		Ram ram = RamRepository.findOne(id);
		RamForm form = new RamForm();
		form.setId(ram.getId());
		form.setRamGb(Integer.toString(ram.getRamGb()));
		return form;
	}

	@Override
	public Ram findOne(Integer valueOf) {
		return RamRepository.findOne(valueOf);
	}

	@Override
	public Page<Ram> findAll(Pageable pageable) {
		return RamRepository.findAll(pageable);
	}

	@Override
	public void save(Ram ram) {
		RamRepository.save(ram);
	}

	@Override
	public Page<Ram> findAll(Pageable pageable, RamFilterForm form) {
		return RamRepository.findAll(new RamFilterAdapter(form), pageable);
	}

	@Override
	public Ram findByName(String ramGb) {
		// TODO Auto-generated method stub
		return null;
	}


}
