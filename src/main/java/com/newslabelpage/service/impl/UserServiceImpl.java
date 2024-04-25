package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.UserMapper;
import com.newslabelpage.pojo.User;
import com.newslabelpage.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

}
