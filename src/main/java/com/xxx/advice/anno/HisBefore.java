package com.xxx.advice.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HisBefore {

    @Before("com.xxx.pointcut.MyPointCut.mypointcut1()")
    public void doBefore() {
        System.out.println("HisBefore.doBefore");
    }
}
