package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pageCon")
public class PageController {
    @RequestMapping("logo.do")
    public String logo(){
        return "/view/logo";
    }
}
