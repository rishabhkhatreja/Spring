
/*
Question9:Access the properties of the JoinPoint in before advice. Print Signature of method being called and its arguments
 */

package Question9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        Service object=ctx.getBean("serviceQuestion9",Service.class);
        object.display(20,39);
    }
}
/*
NOTE:
To run this please uncomment only beans associated with package Question9!!! that is serviceQuestion9 and
Question9.AspectLogging.
 */