package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Capa de persistencia hacia las entidades.
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    //Query Method para consultar estudiantes por su id la anotacion @Query
    @Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
    List<Student> findAllStudent(Long idCourse);

    //Query Method personalizada para consultar estudiantes por su id.
    //List<Student> findAllByCourseId(Long idCourse);
}