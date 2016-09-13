package ua.service.implementation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Hdd;
import ua.entity.Komputer;
import ua.entity.Processor;
import ua.entity.Ram;
import ua.entity.VideoAdapter;
import ua.form.KomputerForm;
import ua.repository.HddRepository;
import ua.repository.KomputerRepository;
import ua.repository.ProcessorRepository;
import ua.repository.RamRepository;
import ua.repository.VideoAdapterRepository;
import ua.service.KomputerService;

@Service
@Transactional
public class KomputerImpl implements KomputerService {

	@Resource
	private KomputerRepository komputerRepository;
	
	@Autowired
	private HddRepository hddRepository;
	
	@Resource
	private ProcessorRepository processorRepository;
	
	@Autowired
	private RamRepository RamRepository;

	@Autowired
	private VideoAdapterRepository videoadapterRepository;

	
	@Override
	public void save(KomputerForm form) {
		Komputer komputer = new Komputer(new Hdd (), new Ram (), new VideoAdapter (),
				new Processor ());
		komputer.setHdd(form.getHdd());
		komputer.setProcessor(form.getProcessor());
		komputer.setRam(form.getRam());
		komputer.setVideoadapter(form.getVideoadapter());
		komputer.setPrice(form.getPrice());
		komputer.setId(form.getId());
		komputerRepository.save(komputer);
	}

	@Override
	public KomputerForm findForForm(int id) {
		KomputerForm form = new KomputerForm();
		form.setId(form.getId());
		form.setHdd(form.getHdd());
		form.setProcessor(form.getProcessor());
		form.setRam(form.getRam());
		form.setVideoadapter(form.getVideoadapter());
		form.setPrice(form.getPrice());
		return form;
	}
	
	@Override
	public List<Komputer> findAll() {
		return komputerRepository.findAll();
	}

	@Override
	public void delete(int id) {
		komputerRepository.delete(id);
	}


	@Override
	public Komputer findOne(Integer valueOf) {
		return komputerRepository.findOne(valueOf);
	}

}
