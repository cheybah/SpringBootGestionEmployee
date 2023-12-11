package com.example.gestion_employee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Task {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long task_id;
    private String task;
    private String task_description;
    private String task_status;
}
