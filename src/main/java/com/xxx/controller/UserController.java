package com.xxx.controller;

import com.xxx.model.po.User;
import com.xxx.model.vo.common.ResultEntity;
import com.xxx.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @PostMapping("user")
    public ResultEntity addUser(@RequestBody User user) {
        logger.debug("UserController addUser " + user);

        User userResult = null;
        ResultEntity resultEntity = new ResultEntity();

        try {
            userResult = userService.addUser(user);
        } catch (Exception e) {
            logger.error(e);
            ResultEntity resultEntityError = new ResultEntity();
            resultEntityError.setStatus(500);
            resultEntityError.setMsg(e.getMessage());
            return resultEntityError;
        }

        resultEntity.setData(userResult);
        resultEntity.setStatus(200);
        resultEntity.setMsg("注册成功");
        return resultEntity;
    }

}
