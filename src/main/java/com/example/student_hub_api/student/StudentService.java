package com.example.student_hub_api.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Nirusan Hariharan",
                        "nirusan.harihara350@gmail.com",
                        LocalDate.of(2003, Month.OCTOBER, 9),
                        22
                )
        );
    }
}
