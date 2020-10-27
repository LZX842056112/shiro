package com.baizhi.springboot_jsp_shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

    @RequestMapping("save")
    //@RequiresRoles(value = {"admin","user"})//用来判断角色 同时具有相同角色
    @RequiresPermissions("user:update:01")//用来判断权限字符串
    public String save(){
        System.out.println("进入方法");
        //获取主题对象
//        Subject subject = SecurityUtils.getSubject();
//        //代码方式
//        if (subject.hasRole("admin")){
//            System.out.println("保存订单！");
//        }else {
//            System.out.println("无权访问！");
//        }
        return "redirect:index.jsp";
    }
}
