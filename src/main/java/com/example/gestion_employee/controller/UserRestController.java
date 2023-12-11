package com.example.gestion_employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.gestion_employee.entities.User;
import com.example.gestion_employee.exception.ResourceNotFoundException;
import com.example.gestion_employee.payload.request.LoginRequest;
import com.example.gestion_employee.payload.request.UserRequest;
import com.example.gestion_employee.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class UserRestController {
	@Autowired
	UserRepository userRep;

	@Autowired
	@GetMapping("/users")
	public List<User> getAllEmployees() {
		return userRep.findAll();
	}

	// delete user rest api
	@DeleteMapping("/users/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id) {
		User user = userRep.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
		userRep.delete(user);
		return ResponseEntity.ok().build();
	}

	@GetMapping("all")

	public List<User> getAllUsers() {
		return userRep.findAll();
	}

	@GetMapping("count")
	public List<User> countUsers() {
		return userRep.countUsers();
	}

	// update user rest api
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
		User user = userRep.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
		user.setUsername(userDetails.getUsername());
		user.setPassword(userDetails.getPassword());
		user.setEmail(userDetails.getEmail());
		user.setSpeciality(userDetails.getSpeciality());
		return ResponseEntity.ok(userRep.save(user));
	}


	@GetMapping("/account/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		User user = userRep.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
		return ResponseEntity.ok(user);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@Validated @RequestBody LoginRequest loginRequest) {
		User user = userRep.findByUsername(loginRequest.getUsername());
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		if (!user.getPassword().equals(loginRequest.getPassword())) {
			return ResponseEntity.notFound().build();
		} else {
			// return ResponseEntity.ok().body(user);user.getUser_id().toString()

			return ResponseEntity.ok().body(user);
		}
	}

	@PostMapping("/register")
	public User saveUser(@Validated @RequestBody User user) {
		return userRep.save(user);
	}

}