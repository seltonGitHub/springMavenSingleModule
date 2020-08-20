package com.xxx.dao;

import com.xxx.model.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {


    @Insert("insert into user values(null, #{name}, #{password}, #{age},#{createTime}, #{updateTime})")
    void addUser(User user);

    @Update("update user set money = #{money} where name = #{name}")
    int updateMoney(@Param("money") int money,@Param("name") String name);
}
