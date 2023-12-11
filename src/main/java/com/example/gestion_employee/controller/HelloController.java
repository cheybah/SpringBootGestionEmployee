package com.example.gestion_employee.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
