package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.�oreProcessor;


public interface �oreProcessorRepository extends JpaRepository<�oreProcessor, Integer>{

//	�oreProcessor findOne(int core);
//	
//	default void delete(int core){
//		delete(findOne(core));
//	}
//	
//
//	@Modifying
//	@Query("DELETE  FROM �oreProcessor  t where t.core=:core")
//	void deleteOne(@Param("core") int core);

}
