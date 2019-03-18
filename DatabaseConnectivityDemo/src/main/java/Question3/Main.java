
/*
Use datasource with DriverManagerDataSource, dbcp2.BasicDataSource and
SingleConnectionDataSource to print the records of user tables
 */

package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDAO obj=ctx.getBean("user",UserDAO.class);
        obj.printUserNames();

    }
}
