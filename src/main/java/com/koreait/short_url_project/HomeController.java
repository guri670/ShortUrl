package com.koreait.short_url_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Value("${custom.site.name}")
    private String customSiteName;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "main page" + customSiteName;
    }

}
