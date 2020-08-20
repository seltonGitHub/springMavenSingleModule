package com.xxx.advice.anno;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HisAfterThrowing {

    @AfterThrowing(value = "com.xxx.pointcut.MyPointCut.mypointcut1()", throwing = "throwable")
    public void doAfterThrowing(Throwable throwable) {
        System.out.println("HisAfterThrowing.doAfterThrowing" + " " + throwable.getMessage());
    }
}
