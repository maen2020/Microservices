package com.microservice.course.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Get y Set.
@Entity // Entidad.
@Builder
@AllArgsConstructor // Constructor con parametros.
@NoArgsConstructor // Constructor vacio.
@Table(name = "courses")
public class Course {

    //Atributos de la clase Course.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String teacher;
}
