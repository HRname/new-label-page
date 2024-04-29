package com.newslabelpage.mapper;

import com.newslabelpage.pojo.TimeSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeSettingMapper {
    @Select("select * from time_setting where user_id=#{userId}")
    TimeSetting getTimeSetting(TimeSetting timeSetting);
}
