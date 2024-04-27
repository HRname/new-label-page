package com.newslabelpage.service;

import com.newslabelpage.pojo.WebApp;

import java.util.List;

public interface WebAppService {
    List<WebApp> getAllWebApp(WebApp webApp);

    void addWebApp(WebApp webApp);

    WebApp getWebApp(Integer id);

    void updateWebApp(WebApp webApp);

    void deleteWebApp(WebApp webApp);
}
