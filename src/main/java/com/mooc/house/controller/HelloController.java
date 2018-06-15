package com.mooc.house.controller;

import com.mooc.house.common.model.User;
import com.mooc.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package: com.mooc.house.controller
 * @Class: HelloController
 * @Description: TODO
 * @Author: zhangyahui
 * @Date: 2018/4/18 19:41
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String helloTest(ModelMap modelMap)
    {
        List<User> userList=userService.getUser();
        User one=userList.get(0);
        modelMap.put("user",one);
        return "hello";
    }
    @RequestMapping("index")
    public String index()
    {
        return "homepage/index";
    }
}