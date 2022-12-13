package com.example.gestion_employee.service;

import java.util.List;

import com.example.gestion_employee.entities.Role;
import com.example.gestion_employee.entities.User;
public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);

	List<User> countUsers();
}