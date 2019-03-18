package Question11.Required;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        InsertRecord ob=ctx.getBean(InsertRecord.class);
            ob.insertUser();

    }

}
