package com.tothenew.thymleaf.controller;

import com.tothenew.thymleaf.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping(value="/")
    @ResponseBody
    public String index()
    {
        return "For Question1 : /Question1 "+"<br>"+"For Question2 : /Question2 "
                +"<br>"+"For Question3 And Question10  : /Question3"+"<br>"+ "For Question4 And Question8 : /Question4"+
                "<br>"+ "For Question5 : /Question5"+"<br>"+ "For Question6 And Question7 : /Question7"
                +"<br>"+ "For Question8 : /Question8"+"<br>"+ "For Question9 : /Question9";
    }
    @RequestMapping(value = "/Question1")
    public String display()
    {
        return "Hello";
    }
    @RequestMapping(value = "/Question2")
    public String displayQuestion2()
    {
        return "HelloWorld";
    }
    @RequestMapping(value = "/Question3")
    public String register()
    {
        return "EmployeeRegistration";
    }

    @RequestMapping(value="/dummy",method = RequestMethod.POST)
    @ResponseBody
    public String displayQuestion3(@ModelAttribute("employee") Employee emp)
    {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(emp);
        return "check out console of intelli j for the result";
    }
    @RequestMapping(value="/Question4")
    public String displayQuestion4(@ModelAttribute("employee") Employee emp, Model model)
    {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Rishabh","aaa@gmail.com",23));
        list.add(new Employee("Harsh","Harsh@gmail.com",24));
        list.add(new Employee("Rohan","Rohan@gmail.com",26));
        list.add(new Employee("sita","sita@gmail.com",29));
        model.addAttribute("EmployeeList",list);
        return "EmployeeTable";
    }
    @RequestMapping(value = "/Question5")
    public String displayQuestion5(Model model)
    {
        Employee emp=new Employee("Rishabh","aaa@gmail.com",23,false);
        model.addAttribute("isAdmin",emp.isAdmin());
        return "IsAdmin";
    }
    @RequestMapping(value = "/Question7")
    public String displayQuestion7(Model model)
    {
        Employee emp=new Employee("Rishabh","rishabh03@gmail.com",23,false);
        model.addAttribute("employee",emp);
        return "AjaxCallPrintServerTime";
    }
    @RequestMapping(value="/servertime")
    @ResponseBody
    public LocalDateTime systemTime()
    {
        return LocalDateTime.now();
    }
    @RequestMapping(value = "/Question9")
    public String displayQuestion9()
    {
        return "EnumValues";
    }
}
