
/*
Question4:Create a logging aspect. Create a pointcut to log all methods Of services .
 */


package Question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        Service service = ctx.getBean("serviceQuestion4", Service.class);
        service.display();
        service.display(10);
        service.display(20,30);
    }
}
/*
NOTE:
To run this please uncomment only beans associated with package Question4!!! that is serviceQuestion4 and
Question4.AspectLogging.
 */