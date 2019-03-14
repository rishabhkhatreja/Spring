package Question5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        Service service = ctx.getBean("serviceQuestion5",Service.class);
        service.display();
        service.display(10);
        service.display(20,30);
    }
}
/*
NOTE:
To run this please uncomment only beans associated with package Question5!!! that is serviceQuestion5 and
Question5.AspectLogging.
 */