package com.xxx.advice.common;

import org.springframework.stereotype.Component;

@Component
public class YourAfter {

    public void doAfter() {
        System.out.println("YourAfter.doAfter");
    }
}
