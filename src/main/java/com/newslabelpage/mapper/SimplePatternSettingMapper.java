package com.newslabelpage.mapper;

import com.newslabelpage.pojo.SimplePatternSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SimplePatternSettingMapper {
    @Select("select * from simple_pattern_setting where user_id=#{userId}")
    SimplePatternSetting getSimplePatternSetting(SimplePatternSetting simplePatternSetting);
}
