package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.SearchSetting;
import com.newslabelpage.service.SearchSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class SearchSettingController {
    @Autowired
    private SearchSettingService searchSettingService;

    @GetMapping("/searchSetting")
    public Result getSearchSetting(SearchSetting searchSetting){
        SearchSetting searchSettingOut = searchSettingService.getSearchSetting(searchSetting);

        return Result.success(searchSettingOut);
    }

    @PutMapping("/searchSetting")
    public Result updateSearchSetting(@RequestBody SearchSetting searchSetting){
        searchSettingService.updateSearchSetting(searchSetting);

        return Result.success();
    }
}
