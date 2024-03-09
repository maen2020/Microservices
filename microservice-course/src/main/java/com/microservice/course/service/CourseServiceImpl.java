package com.microservice.course.service;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
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

    //Inyectar para obtener los estudiantes.
    @Autowired
    private StudentClient studentClient;

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

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {

        // Consultar el curso.
        Course course = courseRepository.findById(idCourse).orElse(new Course());

        //Obtener los estudiantes.
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
