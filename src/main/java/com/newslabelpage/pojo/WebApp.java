package com.newslabelpage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebApp {
    private Integer id;
    private Integer userId;
    private String zoneName;
    private String webName;
    private String url;
    private String domainNameImg;
    private String bgcColor;
}
