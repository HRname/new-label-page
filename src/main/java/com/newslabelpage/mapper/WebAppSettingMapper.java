package com.newslabelpage.mapper;

import com.newslabelpage.pojo.WebAppSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface WebAppSettingMapper {
    @Select("select * from web_app_setting where user_id = #{userId}")
    WebAppSetting getWebAppSetting(WebAppSetting webAppSetting);
    @Update("update web_app_setting set " +
            "web_app_height=#{webAppHeight}," +
            "web_app_width=#{webAppWidth}," +
            "web_app_size=#{webAppSize}," +
            "web_app_opacity=#{webAppOpacity}," +
            "web_app_border_radius=#{webAppBorderRadius}," +
            "web_app_font_size=#{webAppFontSize}," +
            "web_app_select_default=#{webAppSelectDefault}," +
            "web_app_select_round=#{webAppSelectRound} " +
            "where user_id=#{userId}")
    void updateWebAppSetting(WebAppSetting webAppSetting);
}
