
/*
Question6:Log all the methods which throw IOException
 */


package Question6;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ob=new ClassPathXmlApplicationContext("Spring-config.xml");
        Service serviceQuestion6 = ob.getBean("serviceQuestion6", Service.class);
        try {
            serviceQuestion6.display();
        } catch (IOException e) {
            //e.printStackTrace();
        }
        try {
            serviceQuestion6.display(20);
        } catch (IOException e) {
            //e.printStackTrace();
        }
        try {
            serviceQuestion6.display(30,40);
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}

/*
NOTE:
To run this please uncomment only beans associated with package Question6!!! that is serviceQuestion6 and
Question6.AspectLogging.
 */
