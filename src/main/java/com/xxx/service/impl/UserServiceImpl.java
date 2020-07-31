package com.xxx.service.impl;

import com.xxx.dao.IUserDao;
import com.xxx.model.po.User;
import com.xxx.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

        //3. 返回结果给controller
        return user;
    }
}
