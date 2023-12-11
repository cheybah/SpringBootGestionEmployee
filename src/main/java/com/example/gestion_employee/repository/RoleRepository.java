package com.example.gestion_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_employee.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}