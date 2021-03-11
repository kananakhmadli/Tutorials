package com.akh.springbootsecurity.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private static final List<Student> students = Arrays.asList(
            new Student(1, "Kanan"),
            new Student(2, "Huseyin"),
            new Student(3, "Taleh")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return students.get(studentId-1);
    }
}
