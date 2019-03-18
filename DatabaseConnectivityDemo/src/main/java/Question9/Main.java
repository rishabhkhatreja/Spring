


package Question9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDetails object=ctx.getBean("UserMapper",UserDetails.class);
        User user = object.getUser();
        System.out.println(user);
    }
}
