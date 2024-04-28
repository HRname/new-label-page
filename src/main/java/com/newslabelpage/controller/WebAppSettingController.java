package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.WebAppSetting;
import com.newslabelpage.service.WebAppSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class WebAppSettingController {
    @Autowired
    private WebAppSettingService webAppSettingService;

    @GetMapping("/webAppSetting")
    public Result getWebAppSetting(WebAppSetting webAppSetting){
        WebAppSetting webAppSettingOut = webAppSettingService.getWebAppSetting(webAppSetting);

        return Result.success(webAppSettingOut);
    }

    @PutMapping("/webAppSetting")
    public Result updateWebAppSetting(@RequestBody WebAppSetting webAppSetting){
        webAppSettingService.updateWebAppSetting(webAppSetting);

        return Result.success();
    }
}
