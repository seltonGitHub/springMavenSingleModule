package com.xxx.advice.common;

import org.springframework.stereotype.Component;

@Component
public class YourBefore {

    public void before() {
        System.out.println("YourBefore.before");
    }
}
