package com.chaitu.RESTService.rest;

import com.chaitu.RESTService.Entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

//  add postConstructor annotation

@PostConstruct
public void loadData() {

    theStudents = new ArrayList<>();

    theStudents.add(new Student("Chaitanya","Karle"));
    theStudents.add(new Student("Om","Prakash"));
    theStudents.add(new Student("Shiva","Gopa;"));

}

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }

//    Define endpoint for /students/{studentId} - return student at index


    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

    //    just index into the list

    // check the studentID again list size

        if(studentId >= theStudents.size() || studentId < 0){
            throw new StudentNotFoundException("Student Id not found "+studentId);
        }

        return theStudents.get(studentId);
    }




}






