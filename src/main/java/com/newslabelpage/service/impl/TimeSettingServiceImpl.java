package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.TimeSettingMapper;
import com.newslabelpage.pojo.TimeSetting;
import com.newslabelpage.service.TimeSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeSettingServiceImpl implements TimeSettingService {
    @Autowired
    private TimeSettingMapper timeSettingMapper;
    @Override
    public TimeSetting getTimeSetting(TimeSetting timeSetting) {
        return timeSettingMapper.getTimeSetting(timeSetting);
    }

    @Override
    public void updateTimeSetting(TimeSetting timeSetting) {
        timeSettingMapper.updateTimeSetting(timeSetting);
    }
}
