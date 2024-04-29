package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.SimplePatternSettingMapper;
import com.newslabelpage.pojo.SimplePatternSetting;
import com.newslabelpage.service.SimplePatternSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimplePatternSettingServiceImpl implements SimplePatternSettingService {
    @Autowired
    private SimplePatternSettingMapper simplePatternSettingMapper;

    @Override
    public SimplePatternSetting getSimplePatternSetting(SimplePatternSetting simplePatternSetting) {
        return simplePatternSettingMapper.getSimplePatternSetting(simplePatternSetting);
    }
}
