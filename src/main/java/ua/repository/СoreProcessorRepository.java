package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.�oreProcessor;

public interface �oreProcessorRepository extends JpaRepository<�oreProcessor, Integer>, JpaSpecificationExecutor<�oreProcessor>{


//	default void delete(String core){
//		delete(findByName(core));
//	}
//
//	�oreProcessor findByName(String core);
//	
//	@Modifying
//	@Query("DELETE FROM �oreProcessor c WHERE c.core=:core")
//	void deleteByName(@Param("core") String core);


}
