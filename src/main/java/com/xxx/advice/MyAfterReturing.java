package com.xxx.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 原始功能方法执行完成 返回值之后 被调用
 */
@Component
public class MyAfterReturing implements AfterReturningAdvice {


    /**
     * @param o         原始功能返回值
     * @param method    原始方法
     * @param objects   原始方法参数
     * @param o1        代理对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("MyAfterReturing.afterReturning");
        System.out.println("o = " + o + ", method = " + method + ", objects = " + Arrays.deepToString(objects) + ", o1 = " + o1);
    }
}
