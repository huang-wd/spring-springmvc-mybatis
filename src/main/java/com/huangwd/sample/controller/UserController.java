package com.huangwd.sample.controller;

import com.huangwd.sample.entity.User;
import com.huangwd.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by huangweidong@live on 2017/4/15.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public String findAllList(Model model) {
        model.addAttribute("list", userService.findAllList());
        return "user/user";
    }

    @ResponseBody
    @RequestMapping("all")
    public List<User> findAllList2() {
        return userService.findAllList();
    }
}
