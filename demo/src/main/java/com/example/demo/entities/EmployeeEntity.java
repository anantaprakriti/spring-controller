package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Integer age;
    //we cannot perform operation directly on the entity we have to create
    //the repo

}
