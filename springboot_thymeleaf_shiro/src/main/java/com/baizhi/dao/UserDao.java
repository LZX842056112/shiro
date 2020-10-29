package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    //根据用户名查询角色
    User findRolesByUserName(String username);

    //添加用户
    void save(User user);

    //根据用户名查找用户
    User findByUserName(String username);
}
