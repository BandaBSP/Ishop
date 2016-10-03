//package ua.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import ua.entity.Processor;
//
//public interface ProcessorRepository extends JpaRepository<Processor, Integer>, JpaSpecificationExecutor<Processor> {
//
//
//	@Query("SELECT ai FROM Processor ai LEFT JOIN FETCH "
//			+ "ai.coreprocessor ms LEFT JOIN FETCH ai.typeprocessor i "
//			+ "WHERE ai.id=:id")
//	Processor findForForm(@Param("id")int id);
//}
