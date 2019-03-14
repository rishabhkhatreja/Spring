
/*
Question2:Create listeners for spring events.
Question3:Create a CustomEvent which should get published when you invoke connect method of database bean.
 */


package Question2AndQuestion3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        ctx.start();
        Database database = ctx.getBean("database", Database.class);
        database.connect();
        ctx.stop();
    }
}
