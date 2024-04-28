package com.newslabelpage.mapper;

import com.newslabelpage.pojo.SearchSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SearchSettingMapper {
    @Select("select * from search_setting where user_id=#{userId}")
    SearchSetting getSearchSetting(SearchSetting searchSetting);

    @Update("update search_setting set " +
            "search_height=#{searchHeight}," +
            "search_bottom_margin=#{searchBottomMargin}," +
            "search_border_radius=#{searchBorderRadius}," +
            "search_opacity=#{searchOpacity} " +
            "where user_id=#{userId}")
    void updateSearchSetting(SearchSetting searchSetting);
}
