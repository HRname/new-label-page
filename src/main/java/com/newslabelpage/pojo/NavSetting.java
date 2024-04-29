package com.newslabelpage.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NavSetting {
    private Integer id;
    private Integer userId;
    private String settingName;
    private Integer backgroundRed;
    private Integer backgroundGreen;
    private Integer backgroundBlue;
    private float backgroundOpacity;
    @JsonProperty("isBorderRadius")
    private boolean isBorderRadius;
}
