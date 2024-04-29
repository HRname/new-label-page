package com.newslabelpage.mapper;

import com.newslabelpage.pojo.BackgroundSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BackgroundSettingMapper {
    @Select("select * from background_setting where user_id=#{userId}")
    BackgroundSetting getBackgroundSetting(BackgroundSetting backgroundSetting);
}
