
/*
Question3:Create a class Restaurant. Create an interface HotDrink with an abstract method prepareHotDrink.
Create two classes Tea and ExpressTea which implements HotDrink Class.
Create an instance variable of type HotDrink in Restaurant class. Configure Tea and ExpressTea classes beans in Spring XML.
create a bean with the name teaRestaurant of type Restaurant which inject Tea object as dependency using setter method.
 */
/*
Question4:Get both the beans and invoke prepareHotDrink method via hotDrink
instance variables. Try inner bean with expressTeaRestaurant.
 */
/*
Question7:Set the scope of the teaRestaurant bean as proptotype and check the scope type after accessing the bean.
 */


package Question3AndQuestion4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext obj = new ClassPathXmlApplicationContext("Spring-config.xml");

        //Question 3th and 4th implemented
        Restaurant restaurant = obj.getBean("teaRestaurant1", Restaurant.class);
        restaurant.getHotdrink().prepareHotDrink();
        Restaurant restaurant1 = obj.getBean("ExpressRestaurant", Restaurant.class);
        restaurant1.getHotdrink().prepareHotDrink();


        singletonAndPrototype(obj); //Question 7th.

    }


    //Question 7th Implementation
    private static void singletonAndPrototype(ApplicationContext obj) {


        System.out.println("Solution of Question 7:");
        Tea tea = obj.getBean("teaRestaurant", Tea.class);
        Tea tea1 = obj.getBean("teaRestaurant", Tea.class);
        System.out.println("By default This is Singleton hence hashcode of both the object will be same :");
        System.out.println("object tea=" + tea);
        System.out.println("object tea1=" + tea1);


        Tea tea2 = obj.getBean("teaRestaurantPrototype", Tea.class);
        Tea tea3 = obj.getBean("teaRestaurantPrototype", Tea.class);
        System.out.println("This is Prototype hence hashcode of both the object will not be same :");
        System.out.println("object tea2=" + tea2);
        System.out.println("object tea3=" + tea3);

    }
}
