package com.kuaihuoyun.caesar.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 12:13
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
