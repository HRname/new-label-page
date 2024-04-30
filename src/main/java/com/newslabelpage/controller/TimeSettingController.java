package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.TimeSetting;
import com.newslabelpage.service.TimeSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class TimeSettingController {
    @Autowired
    private TimeSettingService timeSettingService;

    @GetMapping("/timeSetting")
    public Result getTimeSetting(TimeSetting timeSetting){
        TimeSetting timeSettingOut = timeSettingService.getTimeSetting(timeSetting);

        return Result.success(timeSettingOut);
    }

    @PutMapping("/timeSetting")
    public Result updateTimeSetting(@RequestBody TimeSetting timeSetting){
        timeSettingService.updateTimeSetting(timeSetting);

        return Result.success();
    }
}
