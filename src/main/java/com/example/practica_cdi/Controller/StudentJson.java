package com.example.practica_cdi.Controller;


import com.example.practica_cdi.Dto.StudentDto;
import com.example.practica_cdi.Service.Impl.StudentServiceimpl;
import com.example.practica_cdi.Service.StudentService;
import com.example.practica_cdi.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/students.json")
public class StudentJson extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            ServletInputStream jsonStream = req.getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            Student student =mapper.readValue(jsonStream,Student.class);
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\"");
                out.println("        <title>Detalle de estudiantes desde json</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("     <h1>Detalle de estudiantes desde json</h1>");
                out.println("<ul>");
                out.println("<li>Id: " + student.getId() + "</li>");
                out.println("<li>Name: " + student.getName() + "</li>");
                out.println("<li>Email: " + student.getEmail() + "</li>");
                out.println("<li>Semestre: " + student.getSemestre() + "</li>");
                out.println("</ul>");
                out.println("    </body>");
                out.println("</html");
            }

        }

        @SneakyThrows
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            StudentService service = new StudentServiceimpl();
            List<StudentDto> students = service.listar();
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(students);
            resp.setContentType("application/json");
            resp.getWriter().write(json);

        }
    }
