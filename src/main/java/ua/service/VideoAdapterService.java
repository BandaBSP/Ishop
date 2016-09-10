package ua.service;

import java.util.List;

import ua.entity.VideoAdapter;
import ua.form.VideoAdapterForm;

public interface VideoAdapterService {


	VideoAdapter findByName(String name);

	void delete(String name);

	List<VideoAdapter> findAll();

	void delete(int id);

	void save(VideoAdapterForm form);

	VideoAdapterForm findForForm(int id);

	VideoAdapter findOne(Integer valueOf);
}
