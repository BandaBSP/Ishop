package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.�oreProcessor;
import ua.form.�oreProcessorForm;


public interface �oreProcessorRepository extends JpaRepository<�oreProcessor, Integer>{

�oreProcessor findOne(�oreProcessorForm form);
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
