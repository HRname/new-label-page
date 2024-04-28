package com.newslabelpage.service.impl;

import com.newslabelpage.mapper.SearchSettingMapper;
import com.newslabelpage.pojo.SearchSetting;
import com.newslabelpage.service.SearchSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchSettingServiceImpl implements SearchSettingService {
    @Autowired
    private SearchSettingMapper searchSettingMapper;

    @Override
    public SearchSetting getSearchSetting(SearchSetting searchSetting) {
        return searchSettingMapper.getSearchSetting(searchSetting);
    }

    @Override
    public void updateSearchSetting(SearchSetting searchSetting) {
        searchSettingMapper.updateSearchSetting(searchSetting);
    }
}
