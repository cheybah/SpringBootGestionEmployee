package com.example.gestionEmp.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestionEmp.persistance.entities.Role;



public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByRole(String role); 

}
