package com.breeze.rain.admin.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("get_info")
    public Object getInfo() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
