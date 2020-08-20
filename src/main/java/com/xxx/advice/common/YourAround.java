package com.xxx.advice.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class YourAround {

    /**
     * @param procedd 原始功能
     */
    public void preAround(ProceedingJoinPoint procedd) throws Throwable {
        //前置增强
        System.out.println("pre Arround");

//        调用原始功能
        Object proceed = procedd.proceed();

        //后置增强
        System.out.println("proceed = " + proceed);
        System.out.println("post Arround");
    }
}
