package Question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Restaurant {


    HotDrink hotdrink1;

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotdrink1=" + hotdrink1 +
                '}';
    }
    public Restaurant(){}

    public Restaurant(HotDrink hotdrink1) {
        this.hotdrink1 = hotdrink1;
    }

    public HotDrink getHotdrink1() {
        return hotdrink1;
    }

    public void setHotdrink1(HotDrink hotdrink1) {
        this.hotdrink1 = hotdrink1;
    }
}
