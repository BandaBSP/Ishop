package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.VideoAdapter;
import ua.form.filter.VideoAdapterFilterForm;
import ua.repository.VideoAdapterRepository;
import ua.service.VideoAdapterService;
import ua.service.implementation.specification.VideoAdapterFilterAdapter;

@Service
@Transactional
public class VideoAdapterImpl implements VideoAdapterService {

	@Autowired
	private VideoAdapterRepository videoadapterRepository;

	@Override
	public void save(VideoAdapter videoadapter) {
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

	@Override
	public VideoAdapter findOne(int id) {
		return videoadapterRepository.findOne(id);
	}

	@Override
	public Page<VideoAdapter> findAll(Pageable pageable) {
		return videoadapterRepository.findAll(pageable);
	}


	@Override
	public Page<VideoAdapter> findAll(Pageable pageable, VideoAdapterFilterForm form) {
		return videoadapterRepository.findAll(new VideoAdapterFilterAdapter(form), pageable);
	}
}