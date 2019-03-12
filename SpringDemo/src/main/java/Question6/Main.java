
/*
Question6:Autowire hotDrink in Restaurant with tea bean byName, byType and constructor.
 */





package Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext obj=new ClassPathXmlApplicationContext("Spring-config.xml");
        Restaurant restaurant=obj.getBean("teaRestaurant2", Question6.Restaurant.class);
        restaurant.getHotdrink1().prepareHotDrink();
    }
}
