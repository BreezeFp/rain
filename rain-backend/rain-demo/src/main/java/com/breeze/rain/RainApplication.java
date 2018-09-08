package com.breeze.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAsync
@RestController
public class RainApplication {

    public static void main(String[] args) {
        SpringApplication.run(RainApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
