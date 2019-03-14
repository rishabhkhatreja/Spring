
/*
Question8:Demonstrate the use of pointCut @Pointcut annotation and Reuse the expression created
 */

package Question8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("Spring-config.xml");
        Service object=con.getBean("serviceQuestion8",Service.class);
        object.display(20);
        object.display(30,40);
    }
}
/*
NOTE:
To run this please uncomment only beans associated with package Question8!!! that is serviceQuestion8 and
Question8.AspectLogging.
 */