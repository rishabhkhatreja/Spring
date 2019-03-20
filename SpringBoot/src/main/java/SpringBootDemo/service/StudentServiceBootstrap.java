package SpringBootDemo.service;

import SpringBootDemo.entity.Student;
import SpringBootDemo.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentServiceBootstrap {

    Logger logger= LoggerFactory.getLogger(StudentServiceBootstrap.class);
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudent(){
        List<Student> studentList = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        logger.info("Reading students from database");
        studentIterator.forEachRemaining(studentList::add);
        return studentList;
    }
}
