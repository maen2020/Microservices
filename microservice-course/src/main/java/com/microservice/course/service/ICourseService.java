package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    // Metodos.
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);

    //Metodo que va hacer el llamado al microservicio estudiantes.
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}