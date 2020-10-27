package com.baizhi.springboot_jsp_shiro.dao;

import com.baizhi.springboot_jsp_shiro.entity.Perms;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDao {
    //根据角色id查询权限集合
    List<Perms> findPermsByRoleId(String id);
}
