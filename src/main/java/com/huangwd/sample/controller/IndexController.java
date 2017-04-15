package com.huangwd.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huangweidong@live on 2017/4/15.
 */
@Controller
public class IndexController {

    @RequestMapping
    public String index() {
        return "index";
    }
}
