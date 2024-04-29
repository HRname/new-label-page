package com.newslabelpage.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimplePatternSetting {
    private Integer id;
    private Integer userId;
    private String settingName;
    private boolean homePageNav;
    private boolean homePageUrlApp;
    @JsonProperty("isSimplePattern")
    private boolean isSimplePattern;
    private Integer placeholder;
}
