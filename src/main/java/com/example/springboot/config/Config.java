package com.example.springboot.config;

import com.example.springboot.service.RandomService;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.ApplicationScope;

@Configuration
public class Config {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("")
                        .version("1.0.0")
                        .description("Demo project for Spring Boot")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(new Contact()
                                .email("molorane@gmail.com")
                                .name("Spring Demo")
                        )
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")
                        ));
    }


    @Bean
    @ApplicationScope
    AppSession appSession() {
        return new AppSession();
    }

    @Bean
    Engine engine() {
        return new Engine();
    }

    @Bean
    Mercedes mercedes() {
        return new Mercedes(engine());
    }
    @Bean
    Toyota toyota() {
        return new Toyota(engine());
    }
}
