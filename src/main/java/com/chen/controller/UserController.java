package com.chen.controller;

import com.chen.domin.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
　　* @description: UserController
　　* @author chenjiandong
　　* @date 2019/4/10 10:43
　　*/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getAllUser")
    public String getAllUser(HttpServletRequest req){
        List<User> userList =  userService.getAllUser();
        req.setAttribute("size",userList.size());
        return "user/userIndex";
    }

}