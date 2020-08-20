package com.xxx.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointCut {

    /**
     * 切点 用来定位 原始功能的位置
     */

    //表示这个对象里面的所有方法
    @Pointcut("bean(userServiceImpl)")
    public void mypointcut2() {}

    //表示具体的某个方法
    @Pointcut("execution(public void com.xxx.service.impl.UserServiceImpl.removeUser(String, String))")
    public void mypointcut3() {}

    //表示具体的某个方法 -- 适配重载
    @Pointcut("execution(public void com.xxx.service.impl.UserServiceImpl.removeUser(..))")
    public void mypointcut4() {}

    //表示具体的类里面的所有方法
    @Pointcut("execution(public * com.xxx.service.impl.UserServiceImpl.*(..))")
    public void mypointcut5() {}

    //表示具体的包里面的所有类和所有方法
    @Pointcut("execution(public * com.xxx.service.impl.*.*(..))")
    public void mypointcut1() {}
}
