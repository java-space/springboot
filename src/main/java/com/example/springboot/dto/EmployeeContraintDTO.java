package com.example.springboot.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeContraintDTO {

    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 20)
    private String fullName;

    @AssertFalse
    private boolean working;

    @Size(min = 10, max = 100, message
            = "About Me must be between 10 and 100 characters")
    private String aboutMe;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Email(message = "Email should be valid")
    private String email;
}
