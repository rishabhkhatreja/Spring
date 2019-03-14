
/*
Question5:Add a logging statement before and after the method ends
 */


package Question5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class AspectLogging {
    @Around("dum()")
    void before(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Before advice is running");
        proceedingJoinPoint.proceed();
        System.out.println("after advice is running");
    }

    @Pointcut("execution(* Service.*(..))")
    void dum() {
    }

}
