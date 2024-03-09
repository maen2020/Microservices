package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Colocar el nombre del microservicio al cual va a consumir y la url principal.
@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {

    //Peticion hacia el endpoint de Student.
    @GetMapping("/search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);
}