package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.User;
import com.newslabelpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://127.0.0.1:8081")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User loginUser = userService.login(user);

        return loginUser != null?Result.success(loginUser):Result.error("用户名或密码错误");
    }

    @PostMapping("/user")
    public Result modifyUser(@RequestBody User user){
        userService.modifyUser(user);

        return Result.success();
    }

    @DeleteMapping("/user")
    public Result deleteUser(@RequestBody User user){
        userService.deleteUser(user);

        return Result.success();
    }
}
