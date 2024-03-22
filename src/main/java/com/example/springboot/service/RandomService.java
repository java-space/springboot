package com.example.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST
        , proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RandomService {

    private Logger logger = LoggerFactory.getLogger(RandomService.class);

    private Integer amount;

    public RandomService() {
        logger.info(" -> Creating new EmployeeService bean");
        final Random rand = new Random();
        this.amount = rand.nextInt(10_000) + 50_000;
    }

    public void print() {
        logger.info("EmployeeService amount: " + amount);
    }
}
