package com.newslabelpage.mapper;

import com.newslabelpage.pojo.BackgroundSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PutMapping;

@Mapper
public interface BackgroundSettingMapper {
    @Select("select * from background_setting where user_id=#{userId}")
    BackgroundSetting getBackgroundSetting(BackgroundSetting backgroundSetting);
    @Update("update background_setting set " +
            "shelter_background_opacity=#{shelterBackgroundOpacity}," +
            "shelter_background_blur=#{shelterBackgroundBlur}," +
            "background_full_path=#{backgroundFullPath} " +
            "where user_id=#{userId}")
    void updateBackgroundSetting(BackgroundSetting backgroundSetting);
}
