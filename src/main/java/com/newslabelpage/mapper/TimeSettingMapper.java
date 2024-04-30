package com.newslabelpage.mapper;

import com.newslabelpage.pojo.TimeSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TimeSettingMapper {
    @Select("select * from time_setting where user_id=#{userId}")
    TimeSetting getTimeSetting(TimeSetting timeSetting);
    @Update("update time_setting set " +
            "is_show=#{isShow}," +
            "is_show_hour_minutes=#{isShowHourMinutes}," +
            "is_show_year=#{isShowYear}," +
            "is_show_month_day=#{isShowMonthDay}," +
            "is_show_week=#{isShowWeek}," +
            "time_font_weight=#{timeFontWeight}," +
            "time_type_twenty_four=#{timeTypeTwentyFour}," +
            "time_font_size=#{timeFontSize}," +
            "time_font_color=#{timeFontColor}," +
            "time_font_color_index=#{timeFontColorIndex} " +
            "where user_id=#{userId}")
    void updateTimeSetting(TimeSetting timeSetting);
}
