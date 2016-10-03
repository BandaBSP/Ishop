package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.VideoAdapter;
import ua.form.filter.VideoAdapterFilterForm;

public interface VideoAdapterService {

	void save(VideoAdapter videoadapter);

	VideoAdapter findByName(String name);

	void delete(String name);

	List<VideoAdapter> findAll();

	void delete(int id);

	VideoAdapter findOne(int id);

	Page<VideoAdapter> findAll(Pageable pageable);

	Page<VideoAdapter> findAll(Pageable pageable, VideoAdapterFilterForm form);

}
