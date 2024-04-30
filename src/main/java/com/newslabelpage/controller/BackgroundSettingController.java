package com.newslabelpage.controller;

import com.newslabelpage.pojo.BackgroundSetting;
import com.newslabelpage.pojo.Result;
import com.newslabelpage.service.BackgroundSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "http://127.0.0.1:8081")
public class BackgroundSettingController {
    @Autowired
    private BackgroundSettingService backgroundSettingService;

    @GetMapping("/backgroundSetting")
    public Result getBackgroundSetting(BackgroundSetting backgroundSetting){
        BackgroundSetting backgroundSettingOut = backgroundSettingService.getBackgroundSetting(backgroundSetting);

        return Result.success(backgroundSettingOut);
    }

    @PutMapping("/backgroundSetting")
    public Result updateBackgroundSetting(@RequestBody BackgroundSetting backgroundSetting){
        backgroundSettingService.updateBackgroundSetting(backgroundSetting);

        return Result.success();
    }
}
