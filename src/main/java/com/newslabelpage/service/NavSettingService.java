package com.newslabelpage.service;

import com.newslabelpage.pojo.NavSetting;

public interface NavSettingService {
    NavSetting getNavSetting(NavSetting navSetting);

    void updateNavSetting(NavSetting navSetting);
}
