package com.example.Demo.sutdent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

            Student kanan = new Student(
                    "Kanan",
                    "kanan.akhmadli99@gmail.com",
                    LocalDate.of(1999, 10, 10));

            Student taleh = new Student(
                    "Taleh",
                    "taleh.ahmadli99@gmail.com",
                    LocalDate.of(2000, 11, 11));
            studentRepository.saveAll(List.of(kanan, taleh));

        };
    }
}
