package com.example.practica_cdi.mapper;


import com.example.practica_cdi.Dto.StudentDto;
import com.example.practica_cdi.model.Student;

public class StudentMapper {

    public static StudentDto mapFrom(StudentDto student){
        return new StudentDto(student.id(), student.name(), student.email(), student.semestre() );
    }
    public static Student mapFromDto(StudentDto student){
        return Student.builder()
                .id(student.id())
                .name(student.name())
                .email(student.email())
                .semestre(student.semestre())
                .build();
    }
}
