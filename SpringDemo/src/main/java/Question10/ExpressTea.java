package Question10;

import org.springframework.stereotype.Service;

@Service
public class ExpressTea implements HotDrink {

    @Override
      public void prepareHotDrink()
        {
            System.out.println("prepare hot drink express tea");
        }


}
