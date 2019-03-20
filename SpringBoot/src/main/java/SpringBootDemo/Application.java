package SpringBootDemo;

import SpringBootDemo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Application {


    //Question3 Solution just we have to create the bean using @bean
    @Bean
    public User getUser() {
        return new User("rishabh", 102);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


/*
Question1:
Solution1:localhost:8080/student

Question3:
Solution3:localhost:8080/user


Question4:
Solution4:localhost:8080/database

Question5:
Solution5:
first create jar file by using Springboot[clean] and springBoot[build]
 then run
localhost:7070/database


Question7:
localhost:7070/studentBootstrap

Question8:

After running
localhost:7070/studentBootstrap
we will see in the console of intelli j there is a msg .... which comes from logger

 */