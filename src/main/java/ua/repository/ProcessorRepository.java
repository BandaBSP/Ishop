//package ua.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import ua.entity.Processor;
//
//
//public interface ProcessorRepository extends JpaRepository<Processor, Integer>{
//
//	Processor findByName(String name);
//	
//	default void delete(String name){
//		delete(findByName(name));
//	}
//	
//	
//	
//	
//	
//	
//
////	@Modifying
////	@Query("DELETE  FROM Processor  t where t.name=:name")
////	void deleteByName(@Param("name") String name);
//
//}
