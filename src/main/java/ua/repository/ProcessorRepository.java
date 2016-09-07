package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Processor;


public interface ProcessorRepository extends JpaRepository<Processor, Integer>{

	@Query("SELECT r FROM Processor r LEFT JOIN FETCH r.typeprocessor WHERE r.id=:id")
	Processor findOneTypeProcessorInited(@Param("id")int id);
	
	@Query("SELECT r FROM Processor r LEFT JOIN FETCH r.coreprocessor WHERE r.id=:id")
	Processor findOne—oreProcessorInited(@Param("id")int id);

}
