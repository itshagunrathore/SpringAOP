package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class MyAspect2 {


    @Before("execution(public void getMsg())")
    public void myAdvice() {
        System.out.println("------------------------------Running Advice #2");
    }


    @Before("execution (public * getMsg())")
    public void myAdvice2() {
        System.out.println("THIS SHOULD EXECUTE LAST");
    }

}
