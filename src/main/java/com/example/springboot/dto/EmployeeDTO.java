package com.example.springboot.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private String fullName;
    private boolean working;
    private String aboutMe;
    private int age;
    private String email;
}
