package com.xxx.advice.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HisAfter {

    @After("com.xxx.pointcut.MyPointCut.mypointcut1()")
    public void doAfter() {
        System.out.println("HisAfter.doAfter");
    }
}
