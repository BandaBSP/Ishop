package ua.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileWriter {

	enum Folder{
		ÑOREPPROCESSOR, TYPEPROCESSOR, PROCESSOR;
	}
	
	String write(Folder folder, MultipartFile file, int id);
}
