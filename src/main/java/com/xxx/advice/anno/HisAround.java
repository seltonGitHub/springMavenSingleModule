package com.xxx.advice.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HisAround {

    @Around("com.xxx.pointcut.MyPointCut.mypointcut1()")
    public void myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("前置代码");

        //原始功能
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("proceed = " + proceed);

        System.out.println("后置代码");
    }
}
