package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    private Integer id;

    private String province; // getProvince()

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "emp_id", nullable = false)
    @JsonIgnore
    private Employee employee;
}
