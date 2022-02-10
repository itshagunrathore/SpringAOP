package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Before("execution(public void getMsg())")
    public void myAdvice() {
        System.out.println("------------------------------Running Advice");
    }

    @Before("execution (public * getMsg())")
    public void myAdvice2() {
        System.out.println("Inside 2nd advice");
    }

    //TODO: Method for one argument use wildcard (*), No argument (), All argument (..)  --also--> com.dao.*.*(..)
    //wildcard method type
    @Before("execution( * updateAccount())")
    public void myUpdateAdvice() {
        System.out.println("INSIDE UPDATE ACCOUNT ADVICE");
    }

    //wildcard specific class method
    @Before("execution( private void aop.dao.Dao.getMsg())")
    public void myAdviceFullyQualified() {
        System.out.println("INSIDE FullyQualified name ADVICE");
    }

    //wildcard method name
    @Before("execution (public void get*())")
    public void myGetAnyAdvice() {
        System.out.println("Inside 2nd advice");
    }

    // ** (REUSE) Use same point cut at many advices. either copy paste || OR create a point cut decleration @Pointcut
    @Pointcut("execution (public void get*())")
    private void forDAOPackage() {
    }

    @Before("forDAOPackage()")
    private void doSomethingAdvice() {
    }

    // **Combine pointcut using && || ! like if else
    @Before("execution( private void getMsg() ) && !forDAOPackage())")
    private void combinationAdvice() {

    }
}
