package com.baizhi.service;

import com.baizhi.entity.User;

public interface UserService {

    //根据用户名查询角色
    User findRolesByUserName(String username);

    //注册用户
    void register(User user);

    //根据用户名查找用户
    User findByUserName(String username);
}
