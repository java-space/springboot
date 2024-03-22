package com.example.springboot;

import com.example.springboot.repos.EmployeeRepo;
import com.example.springboot.service.EmployeeService;
import com.example.springboot.service.RandomService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private EmployeeRepo repo;

    public static void main(String[] args) {
       ConfigurableApplicationContext ao = SpringApplication.run(Bootstrap.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.findAll();
    }
}
