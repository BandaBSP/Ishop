package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Processor;

public interface ProcessorRepository extends JpaRepository<Processor, Integer>, JpaSpecificationExecutor<Processor> {

//	@Query("SELECT ai FROM Processor ai LEFT JOIN FETCH "
//			+ "ai.typeprocessor LEFT JOIN FETCH ai.coreprocessor")
//	List<Processor> findAll();
	
//	Processor findByName(String name);
//	@Query(value = "SELECT r FROM Processor r "
//			+ "LEFT JOIN FETCH r.typeprocessor c WHERE c.id=:id "
//			+ "LEFT JOIN FETCH r.coreprocessor c WHERE c.id=:id"
//			,
//			countQuery="SELECT count(r.id) FROM Processor r "
//					+ "LEFT JOIN r.typeprocessor c WHERE c.id=:id "
//					+ "LEFT JOIN r.coreprocessor c WHERE c.id=:id")
	
}
