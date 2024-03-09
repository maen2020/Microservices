package com.microservice.student.controller;

import com.microservice.student.entities.Student;
import com.microservice.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Capa del controlador(Logica).
@RestController
@RequestMapping("/api/student")
public class StudentController {

    //Creacion de los endpoints.

    //Inyectar la capa de servicio.
    @Autowired
    private IStudentService studentService;

    //Endpoint para crear un estudiante.
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.save(student);
    }

    //Enpoint para consultar todos los estudiantes.
    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent(){
        return ResponseEntity.ok(studentService.findAll());
    }

    //Endpoint para buscar un estudiante.
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    //Endpoint para hacer la consulta o consumir el microservicio de COURSE.
    @GetMapping("/search-by-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
    }
}
