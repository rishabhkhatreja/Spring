package Question10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Restaurant {

    @Autowired
    @Qualifier("teaSer")
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    Restaurant() {

    }
}
