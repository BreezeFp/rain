package com.breeze.rain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author : fupeng
 * @since : 2018/7/30 13:38
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public Mono<String> index() {
        return Mono.just("index");
    }

}
