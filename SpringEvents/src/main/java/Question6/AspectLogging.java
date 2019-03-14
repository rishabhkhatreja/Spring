package Question6;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectLogging {
    @AfterThrowing(pointcut = "execution(public void display(..))", throwing = "ex")
    void afterReturningAdvice(Exception ex) {
        System.out.println("Running AfterThrowing " + ex);
    }


    @Pointcut("execution(* Service.*(..))")
    void dummy()
    {

    }
}
