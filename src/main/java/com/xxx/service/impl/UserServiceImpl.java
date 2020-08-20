package com.xxx.service.impl;

import com.xxx.dao.IUserDao;
import com.xxx.model.po.User;
import com.xxx.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

@Service
public class UserServiceImpl implements IUserService {

    private Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserDao userDao;

    @Override
    public User addUser(User user) throws Exception {

        logger.info(user);

        //1. 数据校检
        //1.1 先判空
        String name = user.getName();

        //使用判空工具类 一般是使用apache的 lang3包里面的StringUtils 这个string工具包 是目前为止 最强大的string工具包
        if (StringUtils.isBlank(name)) {
            throw new Exception("名称不能为空");
        }

        //1.2 判断格式是否正确
        if(name.length() > 255) {
            throw new Exception("名称过长");
        }

        //1.3 判断是否重复

        //2. 数据传输入库
        //2.1 数据填补
        Date date = new Date();
        user.setCreateTime(date);
        user.setUpdateTime(date);

        //2.2 入库
        logger.info("UserServiceImpl addUser " + user);
        userDao.addUser(user);

//        //这儿有一行代码 开启事务
//
//        //执行一个sql语句  给张三转账
//        userDao.addUser(user);
//
//        int i = 1 / 0;
//        //另一个sql语句   张三还钱
//        userDao.addUser(user);

        //这儿有一行代码 提交事务

        //3. 返回结果给controller
        return user;
    }

    @Override
    public void removeUser() {
//        int i = 1 / 0;
        System.out.println("UserServiceImpl.removeUser");
    }

    @Override
    public void removeUser(String name, String age) {
        System.out.println("UserServiceImpl.removeUser");
        System.out.println("name = " + name + ", age = " + age);
    }

    @Override
    public void updateUserMoney(int money) {

    }


    //我们需要给这个方法添加事务
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void aLoanEvent() throws FileNotFoundException {
        // 金鹏 借 20元 给 子琛

        userDao.updateMoney(0, "金鹏");

        //当触发了非运行时异常的时候 并不会触发事务的功能增强
//        FileOutputStream fileOutputStream = new FileOutputStream("/g/pppp/sdagsdg");

        userDao.updateMoney(150, "周子琛");
    }
}
