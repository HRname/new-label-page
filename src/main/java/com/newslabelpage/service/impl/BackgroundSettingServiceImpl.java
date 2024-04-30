package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.BackgroundSettingMapper;
import com.newslabelpage.pojo.BackgroundSetting;
import com.newslabelpage.service.BackgroundSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackgroundSettingServiceImpl implements BackgroundSettingService {
    @Autowired
    private BackgroundSettingMapper backgroundSettingMapper;

    @Override
    public BackgroundSetting getBackgroundSetting(BackgroundSetting backgroundSetting) {
        return backgroundSettingMapper.getBackgroundSetting(backgroundSetting);
    }

    @Override
    public void updateBackgroundSetting(BackgroundSetting backgroundSetting) {
        backgroundSettingMapper.updateBackgroundSetting(backgroundSetting);
    }
}
