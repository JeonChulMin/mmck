package com.mmck.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int today_conut = 0;

    @GetMapping("/hello")
    public String hello()
    {
        today_conut++;
        return "Welcome to 뭐먹! 오늘 방문기록: "+today_conut;
    }
}
