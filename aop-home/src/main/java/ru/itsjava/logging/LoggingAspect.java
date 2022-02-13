package ru.itsjava.logging;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* ru.itsjava.services.*.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Log Before " + joinPoint.getTarget().getClass().getName());
    }

    @After("execution(* ru.itsjava.services.*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Log After " + joinPoint.getTarget().getClass().getName());
    }

    @SneakyThrows
    @Around("execution(* ru.itsjava.services.*.*(..))")
    public Object logAroind(ProceedingJoinPoint joinPoint){
        System.out.println("Log Around Before " + joinPoint.getTarget().getClass().getName());
        Object result = joinPoint.proceed();
        System.out.println("Log Around After " + joinPoint.getTarget().getClass().getName());
        return result;
    }
}
