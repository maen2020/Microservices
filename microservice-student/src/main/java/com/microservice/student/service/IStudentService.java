package com.microservice.student.service;

import com.microservice.student.entities.Student;

import java.util.List;

//Capa de Servicio.
public interface IStudentService {

    //Metodos
    //Listar todos los estudiantes.
    List<Student> findAll();

    //Buscar un estudiante.
    Student findById(Long id);

    //Guardar un estudiante
    void save(Student student);

    //Buscar el listado de estudiantes por el id del curso.
    List<Student> findByIdCourse(Long idCourse);

}
