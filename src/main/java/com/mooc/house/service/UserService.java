package com.mooc.house.service;

import com.mooc.house.common.model.User;
import com.mooc.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.mooc.house.service
 * @Class: UserService
 * @Description: TODO
 * @Author: zhangyahui
 * @Date: 2018/4/8 19:27
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUser()
    {
        return userMapper.selectUsers();
    }
}
