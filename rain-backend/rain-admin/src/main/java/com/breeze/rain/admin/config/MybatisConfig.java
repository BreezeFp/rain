package com.breeze.rain.admin.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.breeze.rain.admin.dao")
public class MybatisConfig {

    @Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }

}
