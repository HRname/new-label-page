package com.newslabelpage.service;

import com.newslabelpage.pojo.SearchSetting;

public interface SearchSettingService {
    SearchSetting getSearchSetting(SearchSetting searchSetting);

    void updateSearchSetting(SearchSetting searchSetting);
}
