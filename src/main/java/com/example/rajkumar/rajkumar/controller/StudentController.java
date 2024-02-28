package com.example.rajkumar.rajkumar.controller;

import com.example.rajkumar.rajkumar.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/all")
    public List<Student> list() {
        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setId(1L);
        s1.setFirstName("Rajkumar");
        s1.setLastName("Mekala");
        s1.setEmail("rajkumar.mekala@cropdata.in");
        students.add(s1);

        Student s2 = new Student();
        s2.setId(1L);
        s2.setFirstName("Pravin Singh");
        s2.setLastName("Waghela");
        s2.setEmail("pravin.waghela@cropdata.in");
        students.add(s2);

        return students;
    }
}
