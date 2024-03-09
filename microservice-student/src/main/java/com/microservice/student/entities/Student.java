package com.microservice.student.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//
@Data // Get y Set.
@Entity // Entidad.
@Builder
@AllArgsConstructor // Constructor con parametros.
@NoArgsConstructor // Constructor vacio.
@Table(name = "students")
public class Student {

    //Atributos de la clase.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "course_id")
    private Long courseId;
}
