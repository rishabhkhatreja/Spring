package Question3AndQuestion4;


import org.springframework.beans.factory.annotation.Required;

public class Restaurant {


    HotDrink hotdrink;

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotdrink=" + hotdrink +
                '}';
    }

    public HotDrink getHotdrink() {
        return hotdrink;
    }

    @Required
    public void setHotdrink(HotDrink hotdrink) {
        this.hotdrink = hotdrink;
    }
}
