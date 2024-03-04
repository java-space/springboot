package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

@Configuration
public class Config {


    @Bean
    @ApplicationScope
    AppSession appSession() {
        return new AppSession();
    }
}
