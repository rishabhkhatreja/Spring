
/*
Use InsertRecord to get the count of users
 */

package Question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        CountUser obj=ctx.getBean("count",CountUser.class);
        obj.userCount();
    }
}

