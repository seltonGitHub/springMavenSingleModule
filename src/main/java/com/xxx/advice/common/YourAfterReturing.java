package com.xxx.advice.common;

import com.xxx.dao.IUserDao;
import org.springframework.stereotype.Component;

@Component
public class YourAfterReturing {

    public void doAfterReturing(Object returnResult) {
        System.out.println("YourAfterReturing.doAfterReturing " + returnResult);
    }
}
