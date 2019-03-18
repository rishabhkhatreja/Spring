package Question11.NotSupported;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        InsertRecord ob=ctx.getBean("InsertUserNotSupported", InsertRecord.class);
        ob.insertUser();
    }
}
