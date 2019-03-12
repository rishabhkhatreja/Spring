/*
Question 1: Create a class Database with 2 instance variables port and name. Configure Database class bean in spring container through Spring XML.
Initialize instance variables using setter method.
 */
/*
Question 2: Get the bean of the class from spring container and print the values of the instance variable.
 */

package Question1AndQuestion2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(obj.getBean("database"));
    }
}
