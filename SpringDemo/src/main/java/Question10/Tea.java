package Question10;

import org.springframework.stereotype.Service;

@Service("teaSer")
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink()
    {
        System.out.println("prepare hot drink tea");
    }
}
