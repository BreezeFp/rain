package com.breeze.rain.controller;

import com.breeze.rain.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : fupeng
 * @since : 2018/7/30 16:55
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public Object login(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

}
