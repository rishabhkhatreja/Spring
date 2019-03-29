package com.ttn.spring.rest.springrest.service;

import com.ttn.spring.rest.springrest.entities.Student;
import com.ttn.spring.rest.springrest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudentList()
    {
        return studentRepository.findAll();
    }
    public void insert(Student student)
    {
        studentRepository.save(student);
    }

    public Student getStudentById(Integer id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.isPresent()? optionalStudent.get():null;
    }

    public void delete(Student student)
    {
        studentRepository.delete(student);
    }

    public boolean login(Student student)
    {
        if(studentRepository.findByNameAndAge(student.getName(),student.getAge()).equals(null))
        {
            return false;
        }
        return true;
    }

}
