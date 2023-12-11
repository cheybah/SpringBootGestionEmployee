package com.example.gestion_employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.gestion_employee.entities.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	@Query("select u from User u")
	List<User> countUsers();
	
}