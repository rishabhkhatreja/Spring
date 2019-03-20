package SpringBootDemo.event;

import SpringBootDemo.controller.DatabaseController;
import SpringBootDemo.entity.Student;
import SpringBootDemo.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {
    @Autowired
    StudentRepository studentRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {

        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
       if (!studentIterator.hasNext()) {

            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Rishabh " + i, "BCA " + i);
                studentRepository.save(student);
            }
      }
        System.out.println("Your Application is up and running");
    }
}
