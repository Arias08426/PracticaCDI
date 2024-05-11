package com.example.practica_cdi.model;

import jakarta.enterprise.context.SessionScoped;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@SessionScoped
public class Student implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String semestre;
}