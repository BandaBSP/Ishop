package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.VideoAdapter;
import ua.repository.VideoAdapterRepository;
import ua.service.VideoAdapterService;

@Service
@Transactional
public class VideoAdapterImpl implements VideoAdapterService {

	@Autowired
	private VideoAdapterRepository videoadapterRepository;

	@Override
	public void save(String name) {
		VideoAdapter videoadapter = new VideoAdapter();
		videoadapter.setName(name);
		videoadapterRepository.save(videoadapter);
	}

	@Override
	public VideoAdapter findByName(String name) {
		return videoadapterRepository.findByName(name);
	}

	@Override
	public void delete(String name) {
		videoadapterRepository.delete(name);
	}

	@Override
	public List<VideoAdapter> findAll() {
		return videoadapterRepository.findAll();
	}

	@Override
	public void delete(int id) {
		videoadapterRepository.delete(id);
	}

}
