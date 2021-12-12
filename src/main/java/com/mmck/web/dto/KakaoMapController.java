package com.mmck.web.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KakaoMapController {

    @GetMapping("/")
    public String map()
    {
        return "map";
    }

    @GetMapping("/keywordmap")
    public String keywordmap()
    {
        return "keywordmap";
    }
}
