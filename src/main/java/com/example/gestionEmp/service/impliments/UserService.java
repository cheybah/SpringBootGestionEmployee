package com.example.gestionEmp.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionEmp.persistance.dao.UserRepository;
import com.example.gestionEmp.persistance.entities.User;
import com.example.gestionEmp.service.interfaces.IUser;

@Service
public class UserService implements IUser {
	
	@Autowired 
	UserRepository userrepository ;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userrepository.saveAndFlush(user);
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		userrepository.deleteById(id);
		return true;
	}

	@Override
	public List<User> getListUser() {
		// TODO Auto-generated method stub
		return  userrepository.findAll();
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return  userrepository.findById(id).get();
	}

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return  userrepository.findByUsername(username);
	}

	@Override
	public int getQuantityOfUser() {
		// TODO Auto-generated method stub
		return  userrepository.getQuantityOfUser();
	}

	@Override
	public User getUserByIdUser(Long id) {
		// TODO Auto-generated method stub
		return userrepository.getUserByIdUser(id);
	} 
}