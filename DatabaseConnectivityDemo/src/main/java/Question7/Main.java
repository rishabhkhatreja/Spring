/*
Use QueryForMap to fetch the user details of the  user
 */

package Question7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDetailMap object=ctx.getBean(UserDetailMap.class);
        object.queryForMapDemo();
    }
}
