/*
Question1:Invoke context events start(), stop() and close().
 */



package Question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
        context.start();
        Database object=context.getBean("databaseQuestion1",Database.class);
        object.databaseDisplay();
        context.stop();
        //context.close();
        // here close will destroy the context object.
        // When we stop context then we can start again but in case of close we cannot start it again.
        context.start();
        Database object1=context.getBean("databaseQuestion1",Database.class);
        object.databaseDisplay();
        context.stop();

    }
}
