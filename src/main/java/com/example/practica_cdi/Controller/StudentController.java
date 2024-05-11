package com.example.practica_cdi.Controller;

import com.example.practica_cdi.Service.StudentService;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "studentController", value = "/private/student-form")
public class StudentController extends HttpServlet {
    @Inject
    private StudentService service;

    }
