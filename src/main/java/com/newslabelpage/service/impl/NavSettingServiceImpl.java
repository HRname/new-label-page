package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.NavSettingMapper;
import com.newslabelpage.pojo.NavSetting;
import com.newslabelpage.service.NavSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavSettingServiceImpl implements NavSettingService {
    @Autowired
    private NavSettingMapper navSettingMapper;
    @Override
    public NavSetting getNavSetting(NavSetting navSetting) {
        return navSettingMapper.getNavSetting(navSetting);
    }

    @Override
    public void updateNavSetting(NavSetting navSetting) {
        navSettingMapper.updateNavSetting(navSetting);
    }
}
