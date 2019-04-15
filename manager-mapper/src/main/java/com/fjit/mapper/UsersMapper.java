package com.fjit.mapper;

import com.fjit.pojo.Users;

import java.util.List;

public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUserAll();
}
