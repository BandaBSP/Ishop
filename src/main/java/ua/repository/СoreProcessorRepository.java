package ua.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.�oreProcessor;
import ua.form.filter.�oreProcessorFilterForm;

public interface �oreProcessorRepository extends	JpaRepository<�oreProcessor, Integer>, JpaSpecificationExecutor<�oreProcessor>{

	Page<�oreProcessor> findAll(�oreProcessorFilterForm form, Pageable pageable);


//
//	default void delete(String core){
//		delete(findOne(Integer.valueOf(core)));
//	}
//
//	�oreProcessor findByName(String core);
//	
//	@Modifying
//	@Query("DELETE FROM �oreProcessor c WHERE c.core=:core")
//	void deleteByName(@Param("core") String core);
//

}
