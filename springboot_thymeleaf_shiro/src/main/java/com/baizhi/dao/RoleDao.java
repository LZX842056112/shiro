package com.baizhi.dao;

import com.baizhi.entity.Perms;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDao {
    //根据角色id查询权限集合
    List<Perms> findPermsByRoleId(String id);
}
