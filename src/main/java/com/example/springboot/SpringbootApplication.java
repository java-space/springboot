package com.example.springboot;

import com.example.springboot.interfaceprojection.NamesOnly;
import com.example.springboot.repos.EmployeeRepoDynamic;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class SpringbootApplication implements CommandLineRunner {

    private EmployeeRepoDynamic repoDynamic;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
