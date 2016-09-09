package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.�oreProcessor;

public interface �oreProcessorRepository extends	JpaRepository<�oreProcessor, Integer> {


	// default void delete(int core){
	// delete(findByName(core));
	// }

	@Modifying
	@Query("DELETE  FROM �oreProcessor  t where t.core=:core")
	void deleteByName(@Param("core") int core);

}
