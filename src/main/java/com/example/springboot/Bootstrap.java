package com.example.springboot;

import com.example.springboot.repos.EmployeeRepoDynamic;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private EmployeeRepoDynamic repoDynamic;

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
