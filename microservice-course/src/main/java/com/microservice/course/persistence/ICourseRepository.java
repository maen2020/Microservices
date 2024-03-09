package com.microservice.course.persistence;

import com.microservice.course.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Capa de persistencia.
@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {
}
