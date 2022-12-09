package com.example.gestionEmp.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.gestionEmp.persistance.entities.User;



public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username); 
	
    @Query(value = "select count(*) from user",nativeQuery = true)
    int getQuantityOfUser();
    @Query(value = "select * from user where id= :id",nativeQuery = true)
    User getUserByIdUser(@Param("id") Long id);

}
