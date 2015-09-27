package com.jprogrammers.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by alireza on 9/27/15.
 */
@Component
public class MovieChecker {

    public void before() {
        System.out.println("This method will be called before target method");
    }

    public void after() {
        System.out.println("This method will be called after target method");
    }

    public void around(ProceedingJoinPoint joinpoint) throws Throwable {

        // this method is a wrapper for target method

        System.out.println("before calling method");

        joinpoint.proceed();

        System.out.println("after calling method");

    }

    public void afterThrowing() {
        System.out.println("This method will be called when target method throws an exception");
    }

}
