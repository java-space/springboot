package com.example.springboot.interfaceprojection;

import org.springframework.beans.factory.annotation.Value;

public interface NamesOnly2 {

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();
}
