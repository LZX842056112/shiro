package com.baizhi.springboot_jsp_shiro.service.Impl;

import com.baizhi.springboot_jsp_shiro.dao.RoleDao;
import com.baizhi.springboot_jsp_shiro.entity.Perms;
import com.baizhi.springboot_jsp_shiro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("RoleService")
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired(required = false)
    private RoleDao roleDao;

    //根据角色id查询权限集合
    @Override
    public List<Perms> findPermsByRoleId(String id) {
        return roleDao.findPermsByRoleId(id);
    }
}
