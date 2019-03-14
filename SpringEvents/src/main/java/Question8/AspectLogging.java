package Question8;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class AspectLogging {

    @Before("singleArg() || doubleArg()")
     void beforeAdvice()
    {
        System.out.println("argument methods of service class is called");
    }

    @Pointcut("execution(public void display(int))")
     void singleArg() {

    }
    @Pointcut("execution(public void display(int,int))")
    void doubleArg() {

    }

}
