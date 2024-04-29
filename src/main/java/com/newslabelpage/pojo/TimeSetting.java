package com.newslabelpage.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSetting {
    private Integer id;
    private Integer userId;
    private String settingName;
    @JsonProperty("isShow")
    private boolean isShow;
    @JsonProperty("isShowHourMinutes")
    private boolean isShowHourMinutes;
    @JsonProperty("isShowYear")
    private boolean isShowYear;
    @JsonProperty("isShowMonthDay")
    private boolean isShowMonthDay;
    @JsonProperty("isShowWeek")
    private boolean isShowWeek;
    private boolean timeFontWeight;
    private boolean timeTypeTwentyFour;
    private Integer timeFontSize;
    private String timeFontColor;
    private Integer timeFontColorIndex;
}
