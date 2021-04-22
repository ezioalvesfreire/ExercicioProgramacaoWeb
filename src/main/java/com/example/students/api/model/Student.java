package com.example.students.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
}

