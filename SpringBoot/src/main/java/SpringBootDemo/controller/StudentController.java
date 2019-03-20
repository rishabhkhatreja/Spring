package SpringBootDemo.controller;


import SpringBootDemo.entity.Student;
import SpringBootDemo.service.StudentService;
import SpringBootDemo.service.StudentServiceBootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService;

    @Autowired
    StudentServiceBootstrap studentServiceBootstrap;

    @GetMapping("/student")
    public List<Student> getDetails() {
        return studentService.getStudent();
    }

    @GetMapping("/studentBootstrap")
    public List<Student> getStudent() {
        return studentServiceBootstrap.getStudent();
    }
}
