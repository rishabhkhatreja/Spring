package com.tothenew.thymleaf.Entity;

public class Employee {
private String name;
private String email;
private Integer age;
private boolean isAdmin;

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String email, Integer age, boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
