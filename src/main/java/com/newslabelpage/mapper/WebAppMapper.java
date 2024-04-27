package com.newslabelpage.mapper;

import com.newslabelpage.pojo.WebApp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WebAppMapper {
    @Select("select * from webapp where user_id=#{ userId }")
    List<WebApp> getAllWebApp(WebApp webApp);

    @Insert("insert into webapp(user_id,zone_name,web_name,url,domain_name_img,bgc_color) values (#{userId},#{zoneName},#{webName},#{url},#{domainNameImg},#{bgcColor})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void addWebApp(WebApp webApp);
    @Select("select * from webapp where id=#{id}")
    WebApp getWebApp(Integer id);
}
