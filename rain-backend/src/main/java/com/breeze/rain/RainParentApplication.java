package com.breeze.rain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fupeng
 * @since 2018-07-30 13:57:13
 */
@MapperScan("com.breeze.rain.mapper")
@SpringBootApplication
public class RainParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RainParentApplication.class, args);
    }
}
