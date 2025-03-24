package com.example.student_hub_api.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // Added dependency injection
    // So the spring boot itself will create the bean of service class
    // But for that, the service class should be annotated with injection (any annotation)
    @Autowired
    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudent();
    }
}
