package com.microservice.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Dentro del DTO se copia lo mismo que la entidad pero sin l id.
@Data //Metodos Get y Set.
@Builder
@AllArgsConstructor //Constructor con parametros.
@NoArgsConstructor //Constructor vacio.
public class StudentDTO {

    private String name;
    private String lastName;
    private String email;
    private Long courseId;
}