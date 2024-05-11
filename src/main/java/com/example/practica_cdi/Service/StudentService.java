package com.example.practica_cdi.Service;


import com.example.practica_cdi.Dto.StudentDto;

import java.sql.SQLException;
import java.util.List;

public interface StudentService<T>{
    List<StudentDto> listar() throws SQLException;

}