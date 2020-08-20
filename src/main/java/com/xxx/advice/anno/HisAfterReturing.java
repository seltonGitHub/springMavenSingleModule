package com.xxx.advice.anno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HisAfterReturing {

    @AfterReturning(value = "com.xxx.pointcut.MyPointCut.mypointcut1()", returning = "myResult")
    public void myAfterRetuning(Object myResult) {
        System.out.println("HisAfterReturing.myAfterRetuning" + " " + myResult);
    }
}
