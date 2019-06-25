package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
　　* @description: IndexController
　　* @author chenjiandong
　　* @date 2019/4/11 11:19
　　*/
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String getAllUser(){
        return "index";//test
    }
	
	

}