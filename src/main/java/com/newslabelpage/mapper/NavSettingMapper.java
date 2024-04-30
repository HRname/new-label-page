package com.newslabelpage.mapper;

import com.newslabelpage.pojo.NavSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface NavSettingMapper {
    @Select("select * from nav_setting where user_id=#{userId}")
    NavSetting getNavSetting(NavSetting navSetting);
    @Update("update nav_setting set " +
            "background_red=#{backgroundRed}," +
            "background_green=#{backgroundGreen}," +
            "background_blue=#{backgroundBlue}," +
            "background_opacity=#{backgroundOpacity}," +
            "is_border_radius=#{isBorderRadius} " +
            "where user_id=#{userId}")
    void updateNavSetting(NavSetting navSetting);
}
