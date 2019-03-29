package com.ttn.spring.rest.springrest.repositories;

import com.ttn.spring.rest.springrest.entities.Student;
import org.springframework.data.repository.CrudRepository;


import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,Integer> {

    List<Student> findAll();

    Student findByNameAndAge(String name,Integer age);

    Optional<Student> findById(Integer Id);

}
