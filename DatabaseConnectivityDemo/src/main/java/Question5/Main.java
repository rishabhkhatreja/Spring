
/*
Get name of the user by providing username to the parametrized query
 */

package Question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        GetUser obj=ctx.getBean("getUser",GetUser.class);
        obj.getUser();
    }
}
