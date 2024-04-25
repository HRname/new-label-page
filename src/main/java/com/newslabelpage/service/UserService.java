package com.newslabelpage.service;



import com.newslabelpage.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User login(User user);
}
