package com.microservice.course.http.response;

import com.microservice.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Clase que va a mapear la respuesta que se le va a mandar cliente.
//Respuesta personalizada.
@Data //Metodos Get y Set.
@AllArgsConstructor //Constructor cn parametros.
@NoArgsConstructor //Constructor vacio.
@Builder
public class StudentByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}
