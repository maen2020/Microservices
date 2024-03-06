package com.microservice.student.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//
@Data // Get y Set.
@Entity // Entidad.
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

    @Column(name = "course_id")
    private Long courseId;
}
