package com.jprogrammers.spring.annonated;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by alireza on 9/27/15.
 */
@Aspect
public class MovieChecker {

    @Pointcut("execution(* com.jprogrammers.spring.MovieLister.*(..))")
    public void checker() {
    }

    @Before("checker()")
    public void before() {
        System.out.println("This method will be called before target method");
    }

    @AfterReturning("checker()")
    public void after() {
        System.out.println("This method will be called after target method");
    }

    @Around("checker()")
    public void around(ProceedingJoinPoint joinpoint) throws Throwable {

        // this method is a wrapper for target method

        System.out.println("before calling method");

        joinpoint.proceed();

        System.out.println("after calling method");

    }

    @AfterThrowing("checker()")
    public void afterThrowing() {
        System.out.println("This method will be called when target method throws an exception");
    }

}
