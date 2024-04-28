package com.newslabelpage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebAppSetting {
    private Integer id;
    private Integer userId;
    private String settingName;
    private Integer webAppHeight;
    private Integer webAppWidth;
    private Integer webAppSize;
    private Float webAppOpacity;
    private Integer webAppBorderRadius;
    private Integer webAppFontSize;
    private Boolean webAppSelectDefault;
    private Boolean webAppSelectRound;
}
