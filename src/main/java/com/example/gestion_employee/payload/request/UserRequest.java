package com.example.gestion_employee.payload.request;

import java.util.List;

public class UserRequest {
    private String username;
    private String password;
    private String email;
    private List<String> roles;
    private List<String> tasks;
    // generate all getters and setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    public List<String> getTasks() {
        return tasks;
    }
    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
