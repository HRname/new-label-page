package com.newslabelpage.controller;

import com.newslabelpage.pojo.BackgroundSetting;
import com.newslabelpage.pojo.Result;
import com.newslabelpage.service.BackgroundSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class BackgroundSettingController {
    @Autowired
    private BackgroundSettingService backgroundSettingService;

    @GetMapping("/backgroundSetting")
    public Result getBackgroundSetting(BackgroundSetting backgroundSetting){
        BackgroundSetting backgroundSettingOut = backgroundSettingService.getBackgroundSetting(backgroundSetting);

        return Result.success(backgroundSettingOut);
    }
}
