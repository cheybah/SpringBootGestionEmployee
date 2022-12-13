package com.example.gestion_employee.entities;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pointing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "HH:mm")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
    Date date;
    Date start_time;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(style = "HH:mm")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
    Date end_time;
}
