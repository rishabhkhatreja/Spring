
/*
Use QueryForList to fetch records of all users
 */

package Question8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDetailList bean = context.getBean("insertList",UserDetailList.class);
        bean.queryForListDemo();
    }
}
