package com.baizhi.springboot_jsp_shiro.service;

import com.baizhi.springboot_jsp_shiro.entity.Perms;

import java.util.List;

public interface RoleService {
    //根据角色id查询权限集合
    List<Perms> findPermsByRoleId(String id);
}
