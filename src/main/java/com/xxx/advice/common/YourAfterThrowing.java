package com.xxx.advice.common;

import org.springframework.stereotype.Component;

@Component
public class YourAfterThrowing {

    public void afterThrowing(Throwable myThrowable) {
        System.out.println("YourAfterThrowing.afterThrowing " + myThrowable.getMessage());
    }
}
