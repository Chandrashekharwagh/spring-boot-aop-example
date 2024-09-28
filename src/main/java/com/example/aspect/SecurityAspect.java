package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Before("execution(* com.example.service.WorkService.doOtherWork(..))")
    public void checkSecurity() {
        System.out.println("Security check passed for accessing doOtherWork");
    }
}
