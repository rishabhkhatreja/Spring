package Question7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class AspectLogging {
    //Execution
    @Before("execution(void display())")
    void beforeAdviceExecution() {
        System.out.println("Execution");
    }
    //Within
    @Before("within(Question7.*)")
    void beforeAdviceWithin() {
        System.out.println("Within");
    }
    //Bean
    @Before("bean(serviceQuestion7))")
    void beforeAdviceBean() {
        System.out.println("Bean");
    }
    //Args
    /*@Before("args(Integer))")
    void beforeAdviceArgs() {
        System.out.println("Args");
    }*/
    //This
    @Before("this(Service))")
    void beforeAdviceThis() {
        System.out.println("This");
    }

}
