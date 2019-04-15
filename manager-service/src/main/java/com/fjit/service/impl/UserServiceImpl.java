package com.fjit.service.impl;

import com.fjit.mapper.UsersMapper;
import com.fjit.pojo.Users;
import com.fjit.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("usersService")
public class UserServiceImpl  implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
