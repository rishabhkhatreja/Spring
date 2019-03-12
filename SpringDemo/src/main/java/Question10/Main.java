
/*
Question10:Use @Component, @Controller, @Repository etc annotation to configure Tea and Restaurant in Spring Container.`
 */


package Question10;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-ConfigDemo.xml");

        Tea tea = ctx.getBean("teaSer", Tea.class);

        Restaurant restaurant = ctx.getBean("restaurant", Restaurant.class);

        restaurant.hotDrink.prepareHotDrink();
    }
}
