package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.WebAppMapper;
import com.newslabelpage.pojo.WebApp;
import com.newslabelpage.service.WebAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebAppServiceImpl implements WebAppService {
    @Autowired
    private WebAppMapper webAppMapper;

    @Override
    public List<WebApp> getAllWebApp(WebApp webApp) {
        return webAppMapper.getAllWebApp(webApp);
    }

    @Override
    public void addWebApp(WebApp webApp) {
        webAppMapper.addWebApp(webApp);
    }

    @Override
    public WebApp getWebApp(Integer id) {
        return webAppMapper.getWebApp(id);
    }

    @Override
    public void updateWebApp(WebApp webApp) {
        webAppMapper.updateWebApp(webApp);
    }

    @Override
    public void deleteWebApp(WebApp webApp) {
        webAppMapper.deleteWebApp(webApp);
    }
}
