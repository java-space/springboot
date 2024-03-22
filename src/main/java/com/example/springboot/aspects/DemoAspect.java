package com.example.springboot.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    //@Before("execution(* com.example.springboot.service.EmployeeServiceImpl.getList(..))")
    public void before() {
        System.out.println("DemoAspect @Before");
    }

}
