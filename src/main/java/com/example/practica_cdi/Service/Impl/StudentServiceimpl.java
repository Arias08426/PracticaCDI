package com.example.practica_cdi.Service.Impl;

import com.example.practica_cdi.Dto.StudentDto;
import com.example.practica_cdi.Repository.Repository;
import com.example.practica_cdi.Service.StudentService;
import com.example.practica_cdi.mapper.StudentMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
    public class StudentServiceimpl implements StudentService {
        @Inject
        private Repository<StudentDto> studentRepository;

    @Override
    public List<StudentDto> listar() throws SQLException {
        return studentRepository.listar().stream().map(e->StudentMapper.mapFrom(e)).collect(Collectors.toList());
    }
}



