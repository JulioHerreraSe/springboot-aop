package com.julio.curso.springboot.app.aop.springboot_aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingServicePointcuts {

    @Pointcut("execution(* com.julio.curso.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void greetingLoggerPointCut() {}

     @Pointcut("execution(* com.julio.curso.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void greetingFooLoggerPointCut() {}

}
