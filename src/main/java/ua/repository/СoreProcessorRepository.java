package ua.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.ÑoreProcessor;
import ua.form.filter.ÑoreProcessorFilterForm;

public interface ÑoreProcessorRepository extends	JpaRepository<ÑoreProcessor, Integer>, JpaSpecificationExecutor<ÑoreProcessor>{

	Page<ÑoreProcessor> findAll(ÑoreProcessorFilterForm form, Pageable pageable);


//
//	default void delete(String core){
//		delete(findOne(Integer.valueOf(core)));
//	}
//
//	ÑoreProcessor findByName(String core);
//	
//	@Modifying
//	@Query("DELETE FROM ÑoreProcessor c WHERE c.core=:core")
//	void deleteByName(@Param("core") String core);
//

}
