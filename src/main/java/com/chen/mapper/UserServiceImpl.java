package com.chen.mapper;

import com.chen.dao.UserDao;
import com.chen.domin.User;
import com.chen.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
　　* @description: UserServiceImpl
　　* @author chenjiandong
　　* @date 2019/4/10 11:13
　　*/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

}
