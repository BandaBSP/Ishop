package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Ram;

public interface RamRepository extends JpaRepository<Ram, Integer> {
	
}
