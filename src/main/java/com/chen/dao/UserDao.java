package com.chen.dao;


import com.chen.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    List<User> getAllUser();
}