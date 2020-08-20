package com.xxx.advice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        //这个前置功能增强会不会被调用
        System.out.println("MyBefore.before");

        System.out.println("method name" + method.getName());

        System.out.println("method args " + objects.length);

        System.out.println("o = " + o);
    }
}
