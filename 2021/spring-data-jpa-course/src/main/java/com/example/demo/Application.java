package com.example.demo;

import com.sun.istack.NotNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner lineRunner(StudentRepository studentRepository) {
        return args -> {
            Student kanan=new Student("Kanna","Akhmadli","kanan.akhmadli99@gmail.com",20);
            studentRepository.save(kanan);

        };
    }

}
