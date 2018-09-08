package com.breeze.rain.web.controller;

import com.breeze.rain.web.exception.UserNotExistException;
import com.breeze.rain.web.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@RestController
public class UserController {

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> query(@RequestParam String username) {
        List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        list.add(new User());

        return list;
    }

    @GetMapping("/user/{id:\\d}")
    public User getUserById(@PathVariable("id") String id) {
        throw new UserNotExistException("id");
    }

    @RequestMapping("/order")
    public Callable<String> order() {
        log.info("kaishi");
        Callable<String> result = () -> {
            log.info("fu1");
            Thread.sleep(1000);
            log.info("fu2");
            return "success";
        };
        log.info("jieshu");
        return result;
    }
}
