package com.newslabelpage.mapper;

import com.newslabelpage.pojo.SimplePatternSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SimplePatternSettingMapper {
    @Select("select * from simple_pattern_setting where user_id=#{userId}")
    SimplePatternSetting getSimplePatternSetting(SimplePatternSetting simplePatternSetting);
    @Update("update simple_pattern_setting set " +
            "home_page_nav=#{homePageNav}," +
            "home_page_url_app=#{homePageUrlApp}," +
            "is_simple_pattern=#{isSimplePattern}," +
            "placeholder=#{placeholder} " +
            "where user_id=#{userId}")
    void updateSimplePatternSetting(SimplePatternSetting simplePatternSetting);
}
