package com.fjit.web.controller;

import com.fjit.pojo.Users;
import com.fjit.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户控制器
 */
@Controller
@RequestMapping("/user")//以user开头的会进入这个方法
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }
}
