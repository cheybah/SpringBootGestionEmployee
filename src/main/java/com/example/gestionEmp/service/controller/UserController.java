package com.example.gestionEmp.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.gestionEmp.persistance.entities.User;
import com.example.gestionEmp.service.interfaces.IUser;


@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	IUser userservice;
	
	@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    User save(@RequestBody User user) {	
		  System.out.println("*******wsol ***********");
		  User u=userservice.saveUser(user);
		  System.out.println("*******"+u.getEmail());
        return u ;
    }
	
	@GetMapping("/{id}")
	User getUserById(@PathVariable Long id) {
        return userservice.getUser(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityUser() {
        return userservice.getQuantityOfUser();
    }
	
	@GetMapping("/userByName/{username}")
	User getUserByName(@PathVariable String username) {
        return userservice.findUserByName(username);
    }
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		userservice.deleteUser(id);
        return true;
    }

}
