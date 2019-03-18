package Question11.RequiresNew;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        InsertRecord ob=ctx.getBean("InsertUser",InsertRecord.class);
        ob.insertUser();

    }
}
