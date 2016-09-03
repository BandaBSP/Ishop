package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.ÑoreProcessor;


public interface ÑoreProcessorRepository extends JpaRepository<ÑoreProcessor, Integer>{

//	ÑoreProcessor findOne(int core);
//	
//	default void delete(int core){
//		delete(findOne(core));
//	}
//	
//
//	@Modifying
//	@Query("DELETE  FROM ÑoreProcessor  t where t.core=:core")
//	void deleteOne(@Param("core") int core);

}
