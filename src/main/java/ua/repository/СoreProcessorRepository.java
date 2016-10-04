package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.ÑoreProcessor;

public interface ÑoreProcessorRepository extends JpaRepository<ÑoreProcessor, Integer>, JpaSpecificationExecutor<ÑoreProcessor>{


//	default void delete(String core){
//		delete(findByName(core));
//	}
//
//	ÑoreProcessor findByName(String core);
//	
//	@Modifying
//	@Query("DELETE FROM ÑoreProcessor c WHERE c.core=:core")
//	void deleteByName(@Param("core") String core);


}
