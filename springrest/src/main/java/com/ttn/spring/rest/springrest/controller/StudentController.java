package com.ttn.spring.rest.springrest.controller;

import com.ttn.spring.rest.springrest.entities.Student;
import com.ttn.spring.rest.springrest.exceptions.UserNotFoundException;
import com.ttn.spring.rest.springrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    String helloWorld(@RequestHeader(name = "Accept-Language",required = false) Locale locale){
        System.out.println("hello world");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("good.morning.message",null,locale);
    }

    @RequestMapping("/students")
    @ResponseBody
    public List<Student> display() {
        return studentService.getStudentList();
    }

    @RequestMapping("/registration")
    public String register() {
        return "Registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String displayQuestion3(@ModelAttribute("student") Student student) {
        if(student.getName().equals(null)||student.getAge()==null)
        {
            return "Registration";
        }
            studentService.insert(student);
         return "Registration";
    }
    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Integer id){
        Student student = studentService.getStudentById(id);
        if(student==null) {
            throw new UserNotFoundException("User not found");
        }
        studentService.delete(student);
    }























    @RequestMapping("/Login")
    public String login() {
        return "Login";
    }
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String login(@ModelAttribute("student") Student student) {
        boolean login = studentService.login(student);
        if(login)
        {
         return "Dashboard";
        }
        else
        {
            return "Login";
        }

    }
}