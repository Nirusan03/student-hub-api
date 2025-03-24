package com.example.student_hub_api.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    /*
      1. Added dependency injection
      2. So the spring boot itself will create the bean of service class
      3. But for that, the service class should be annotated with injection (any annotation)
     */
    @Autowired
    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudent();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
