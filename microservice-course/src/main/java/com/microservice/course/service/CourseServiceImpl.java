package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Capa de Servicio.
@Service
public class CourseServiceImpl implements ICourseService{

    //Inyectar la capa de persistencia.
    @Autowired
    private ICourseRepository courseRepository;

    //Metodos.
    //Listar todos los cursos.
    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    //Buscar un solo curso.
    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    //Guardar un curso.
    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }
}
