package Question9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectLogging {
    @After("execution(public void display(int,int))")
    void advice(JoinPoint joinPoint)
    {
        Object[] args = joinPoint.getArgs();
        System.out.println("signature of the method is="+joinPoint.getSignature());
        System.out.println("argument of the method are=");
        for (Object a:args) {
            System.out.println((Integer)a);
        }

    }

}
