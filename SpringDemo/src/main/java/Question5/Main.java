
/*
    Create Class Complex as follows: class complex {    List list;

           Set set;

          Map map;

          } Initialize all the instance variables of the complex class using Spring XML. Give bean name as

complexBean. Get the bean and display the properties.
 */


package Question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext obj=new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(obj.getBean("complex"));
    }
}
