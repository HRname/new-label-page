package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.WebAppSettingMapper;
import com.newslabelpage.pojo.WebAppSetting;
import com.newslabelpage.service.WebAppSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebAppSettingServiceImpl implements WebAppSettingService {
    @Autowired
    private WebAppSettingMapper webAppSettingMapper;
    @Override
    public WebAppSetting getWebAppSetting(WebAppSetting webAppSetting) {
        return webAppSettingMapper.getWebAppSetting(webAppSetting);
    }

    @Override
    public void updateWebAppSetting(WebAppSetting webAppSetting) {
        webAppSettingMapper.updateWebAppSetting(webAppSetting);
    }
}
