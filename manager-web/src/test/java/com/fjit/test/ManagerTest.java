package com.fjit.test;

import com.fjit.mapper.UsersMapper;
import com.fjit.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper userMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUname("张三");
        users.setPwd("123");
        this.userMapper.insertUser(users);
    }
}
