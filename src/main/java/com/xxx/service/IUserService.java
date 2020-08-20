package com.xxx.service;

import com.xxx.model.po.User;

import java.io.FileNotFoundException;

public interface IUserService {
    User addUser(User user) throws Exception;
    void removeUser();
    void removeUser(String name, String age);
    void updateUserMoney(int money);
    void aLoanEvent() throws FileNotFoundException;
}
