/*
Insert one record using InsertRecord
 */


package Question6;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
     User obj=new User();
     obj.setAge(24);
     obj.setDob("1995-03-01");
     obj.setUsername("sita@123");
     obj.setPassword("sitaram");
     obj.setName("sita");
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        InsertRecord object=ctx.getBean("insert",InsertRecord.class);
        object.insertUser(obj);
    }
}
