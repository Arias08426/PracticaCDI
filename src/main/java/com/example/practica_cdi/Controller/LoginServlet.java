package com.example.practica_cdi.Controller;

import com.example.practica_cdi.Service.LoginService;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

    @WebServlet("/login")
    public class LoginServlet extends HttpServlet {
        final static String USERNAME = "admin";
        final static String PASSWORD = "12345";
        @Inject
        LoginService auth;
    }


