package SpringBootDemo.service;

import SpringBootDemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return Arrays.asList(new Student(1,"Rishabh","BCA"),new Student(2,"Navjot","MCA"));
    }
}
