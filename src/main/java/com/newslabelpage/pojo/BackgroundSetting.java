package com.newslabelpage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackgroundSetting {
    private Integer id;
    private Integer userId;
    private String settingName;
    private Integer shelterBackgroundOpacity;
    private float shelterBackgroundBlur;
    private String backgroundFullPath;
}
