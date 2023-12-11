package com.example.gestion_employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_employee.entities.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {
	Task findByTask(String task);
}