package com.newslabelpage.service;

import com.newslabelpage.pojo.WebAppSetting;

public interface WebAppSettingService {
    WebAppSetting getWebAppSetting(WebAppSetting webAppSetting);

    void updateWebAppSetting(WebAppSetting webAppSetting);
}
