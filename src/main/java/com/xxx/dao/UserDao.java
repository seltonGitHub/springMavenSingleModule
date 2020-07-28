package com.xxx.dao;

import com.xxx.model.po.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public void addUser(User user) {
        sqlSession.insert("addUser", user);
        sqlSession.commit();
    }
}
