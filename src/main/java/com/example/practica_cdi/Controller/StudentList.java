package com.example.practica_cdi.Controller;

import com.example.practica_cdi.Dto.StudentDto;
import com.example.practica_cdi.Service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(name = "studentId", value = "/student-formId")
public class StudentList extends HttpServlet {
    @Inject
    private StudentService service;

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        Connection conn = (Connection) req.getAttribute("conn");
        ServletInputStream JsonStream = req.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        StudentDto studentDto = mapper.readValue(JsonStream,
                StudentDto.class);
        Long id = studentDto.id();
        service.listar();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Students</h1>");
        out.println(service.listar().get(0));
        out.println("</body></html>");
    }
}
