//package ua.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import ua.entity.Komputer;
//
//public interface KomputerRepository extends JpaRepository<Komputer, Integer> {
//
//	@Query("SELECT ai FROM Komputer ai "
//			+ "LEFT JOIN FETCH ai.processor "
//			+ "LEFT JOIN FETCH ai.videoadapter "
//			+ "LEFT JOIN FETCH ai.hdd "
//			+ "LEFT JOIN FETCH ai.ram ")
//	List<Komputer> findAll();
//	
//}
