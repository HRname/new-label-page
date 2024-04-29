package com.newslabelpage.controller;

import com.newslabelpage.pojo.NavSetting;
import com.newslabelpage.pojo.Result;
import com.newslabelpage.service.NavSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class NavSettingController {
    @Autowired
    private NavSettingService navSettingService;

    @GetMapping("/navSetting")
    public Result getNavSetting(NavSetting navSetting){
        NavSetting navSettingOut = navSettingService.getNavSetting(navSetting);

        return Result.success(navSettingOut);
    }
}
