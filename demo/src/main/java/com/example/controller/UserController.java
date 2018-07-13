package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/7/4 21:56.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<User> queryAll(){
        List<User> list = new ArrayList<User>();
        try {
            list = service.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public int addUser(){
        User user = new User();
        user.setUsername("zy" + 5);
        user.setPasswd("123456");
        user.setAge(20 + 5);
        user.setAddress("xa");
        int count = 0;
        try {
            count = service.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
