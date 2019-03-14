package Question4;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectLogging {
    @Before("dummy()")
    void before() {

        System.out.println("before advice is running");
    }
    @Pointcut("execution(* Service.*(..))")
    void dummy()
    {

    }
}
