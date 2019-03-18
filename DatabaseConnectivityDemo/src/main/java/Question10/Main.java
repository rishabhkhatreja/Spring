
/*
Integrate Hibernate with Spring and use hql query to count the number of records in user table.
 */


package Question10;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDAO object=ctx.getBean("UserDAO",UserDAO.class);
        object.sessionFactoryDemo();
    }
}
