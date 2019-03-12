
/*
Question9:Use @Autowired annotation to wire Tea with Restaurant class Using setter method, field and constructor.
 */


package Question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("Spring-config.xml");
        Restaurant restaurant = obj.getBean("teaRestaurant3", Question9.Restaurant.class);
        restaurant.getHotDrink2().prepareHotDrink();
    }
}
