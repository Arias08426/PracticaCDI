package com.example.practica_cdi.Repository.RepositoryImpl;

import com.example.practica_cdi.Repository.Repository;
import com.example.practica_cdi.annotations.MysqlConn;
import com.example.practica_cdi.model.Student;
import jakarta.inject.Inject;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryJdbcImpl implements Repository<Student> {
    @Inject
    @MysqlConn
    private Connection conn;

    @Override
    public List<Student> listar() throws SQLException {
        return null;
    }

    @Override
    public Student porId(Long id) throws SQLException {
        return null;
    }

    @Override
    public void guardar(Student student) throws SQLException {

    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }
}