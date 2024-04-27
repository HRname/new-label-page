package com.newslabelpage.controller;

import com.newslabelpage.pojo.Result;
import com.newslabelpage.pojo.WebApp;
import com.newslabelpage.service.WebAppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@Slf4j
@RestController
public class WebAppController {
    @Autowired
    private WebAppService webAppService;

    @GetMapping("/searchHome")
    public Result getAllWebApp(WebApp webApp){
        List<WebApp> webApps = webAppService.getAllWebApp(webApp);

        return Result.success(webApps);
    }

    @PostMapping("/searchHome")
    public Result addWebApp(@RequestBody WebApp webApp){
       webAppService.addWebApp(webApp);

       Integer id = webApp.getId();
       WebApp returnWebApp = webAppService.getWebApp(id);

       return Result.success(returnWebApp);
    }
}
