package com.newslabelpage.service;
import com.newslabelpage.pojo.User;


public interface UserService {

    User login(User user);

    void modifyUser(User user);

    void deleteUser(User user);
}
