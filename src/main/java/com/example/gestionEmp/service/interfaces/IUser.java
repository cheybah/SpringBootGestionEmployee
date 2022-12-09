package com.example.gestionEmp.service.interfaces;

import java.util.List;

import com.example.gestionEmp.persistance.entities.User;

public interface IUser {
	
	User saveUser(User user);
    User updateUser(User user);
    boolean deleteUser(Long id);
    List<User> getListUser();
    User getUser(Long id);
    User findUserByName(String username);
    int getQuantityOfUser();
    User getUserByIdUser(Long id);

}
