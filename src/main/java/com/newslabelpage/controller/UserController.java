package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.User;
import com.newslabelpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:8081")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public Result getAllUser(){
        List<User> userList = userService.getAllUser();

        return Result.success(userList);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User loginUser = userService.login(user);

        return loginUser != null?Result.success(loginUser):Result.error("用户名或密码错误");
    }
}
