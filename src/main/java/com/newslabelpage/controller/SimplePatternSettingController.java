package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.SimplePatternSetting;
import com.newslabelpage.service.SimplePatternSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class SimplePatternSettingController {
    @Autowired
    private SimplePatternSettingService simplePatternSettingService;

    @GetMapping("/simplePatternSetting")
    public Result getSimplePatternSetting(SimplePatternSetting simplePatternSetting){
        SimplePatternSetting simplePatternSettingOut = simplePatternSettingService.getSimplePatternSetting(simplePatternSetting);

        return Result.success(simplePatternSettingOut);
    }

    @PutMapping("/simplePatternSetting")
    public Result updateSimplePatternSetting(@RequestBody SimplePatternSetting simplePatternSetting){
        simplePatternSettingService.updateSimplePatternSetting(simplePatternSetting);

        return Result.success();
    }
}
