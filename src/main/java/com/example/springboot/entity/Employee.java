package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {

    @Id
    private Integer id;

    private String firstName; // getFirstName()
    private String lastName; // getLastName()

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Address> addresses; // getAddresses()
}
