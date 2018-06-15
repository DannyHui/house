package com.mooc.house.controller;

import com.mooc.house.common.model.User;
import com.mooc.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package: com.mooc.house.controller
 * @Class: UserController
 * @Description: TODO
 * @Author: zhangyahui
 * @Date: 2018/4/8 19:22
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public List<User>  getUser()
    {
         return userService.getUser();
    }
}
