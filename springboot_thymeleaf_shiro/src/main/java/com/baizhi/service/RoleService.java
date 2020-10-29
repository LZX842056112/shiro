package com.baizhi.service;

import com.baizhi.entity.Perms;

import java.util.List;

public interface RoleService {
    //根据角色id查询权限集合
    List<Perms> findPermsByRoleId(String id);
}
