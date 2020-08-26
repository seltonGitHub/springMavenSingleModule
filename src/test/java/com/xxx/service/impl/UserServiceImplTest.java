package com.xxx.service.impl;


import com.xxx.dao.IUserDao;
import com.xxx.model.po.User;
import com.xxx.service.IOrgService;
import com.xxx.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc-config.xml", "classpath:spring-config.xml"})
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Autowired
    private IOrgService orgService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testAdd() {
        //redistemplate只能做键的一些删除动作 至于具体的添加操作 需要再次生成以ops对象
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();

        valueOperations.set("weather", "阴天");

//        valueOperations.set();

        String weather = valueOperations.get("weather");
        System.out.println("weather = " + weather);

    }

    @Test
    public void removeUserTest() throws Exception {
        userService.removeUser();
        userService.removeUser("大牛", "18");

        orgService.addOrg();

        User user = new User();
        user.setName("klkl");
        userService.addUser(user);
    }

    @Test
    @Transactional
    public void aLoanEventTest() throws FileNotFoundException {
        userService.aLoanEvent();

        throw new RuntimeException();
    }
}