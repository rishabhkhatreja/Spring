package Question11.Never;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        InsertRecord ob=ctx.getBean("InsertUserNever",InsertRecord.class);
        ob.insertUser();
    }
}
