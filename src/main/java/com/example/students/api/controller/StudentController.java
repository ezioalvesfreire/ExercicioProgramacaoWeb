package com.example.students.api.controller;

import com.example.students.api.model.Student;
import com.example.students.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<Object> createStudent (@RequestBody Student student){
         Student savedStudent = studentRepository.save(student);

         URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                 .path("/{id}").buildAndExpand(savedStudent.getId()).toUri();

         return ResponseEntity.created(location).build();

    }
}
