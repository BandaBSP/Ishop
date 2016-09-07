package ua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.entity.Processor;


public interface ProcessorRepository extends JpaRepository<Processor, Integer>{

	@Query("SELECT ai FROM Processor ai LEFT JOIN FETCH "
			+ "ai.typeprocessor LEFT JOIN FETCH ai.coreprocessor")
	List<Processor> findAll();
}
