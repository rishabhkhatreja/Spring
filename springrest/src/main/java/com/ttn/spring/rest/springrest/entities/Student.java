package com.ttn.spring.rest.springrest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(value = {"id"})
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 2,message = "Name should have at least 2 characters")
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public Student() {
    }

    public Student( String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
