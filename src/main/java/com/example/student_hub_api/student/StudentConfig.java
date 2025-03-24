package com.example.student_hub_api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student nirusan = new Student(
                    "Nirusan Hariharan",
                    "nirusan.harihara350@gmail.com",
                    LocalDate.of(2003, Month.OCTOBER, 9)
            );

            Student malith = new Student(
                    "Malith Lekamage",
                    "malith.lekamge@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 10)
            );

            repository.saveAll(List.of(nirusan, malith));
        };
    }
}
