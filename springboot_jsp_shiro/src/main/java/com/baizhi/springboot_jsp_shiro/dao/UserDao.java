package com.baizhi.springboot_jsp_shiro.dao;

import com.baizhi.springboot_jsp_shiro.entity.User;
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
