package com.newslabelpage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchSetting {
    private Integer id;
    private Integer userId;
    private String settingName;
    private Integer searchHeight;
    private Integer searchBottomMargin;
    private Integer searchBorderRadius;
    private Float searchOpacity;
}
