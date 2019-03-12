package Question9;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {

    HotDrink hotDrink2;

    public HotDrink getHotDrink2() {
        return hotDrink2;
    }

    @Autowired
    public void setHotDrink2(HotDrink hotDrink2) {
        this.hotDrink2 = hotDrink2;
    }

    public Restaurant(HotDrink hotDrink2) {
        this.hotDrink2 = hotDrink2;
    }

    public Restaurant() {

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink2=" + hotDrink2 +
                '}';
    }
}
