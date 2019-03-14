
/*
Question7:Apply execution, within, args, this and bean expressions on the before and after advice of service bean.
 */

package Question7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
        Service obj=context.getBean("serviceQuestion7",Service.class);
        obj.display();
        obj.display(20);
        obj.display(30,40);
    }
}

/*
NOTE:
To run this please uncomment only beans associated with package Question7!!! that is serviceQuestion7 and
Question7.AspectLogging.
 */