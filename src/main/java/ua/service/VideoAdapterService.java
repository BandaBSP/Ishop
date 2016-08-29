package ua.service;

import java.util.List;

import ua.entity.VideoAdapter;

public interface VideoAdapterService {

	void save(String name);

	VideoAdapter findByName(String name);

	void delete(String name);

	List<VideoAdapter> findAll();

	void delete(int id);
}
