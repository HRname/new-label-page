package com.newslabelpage.mapper;

import com.newslabelpage.pojo.NavSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NavSettingMapper {
    @Select("select * from nav_setting where user_id=#{userId}")
    NavSetting getNavSetting(NavSetting navSetting);
}
