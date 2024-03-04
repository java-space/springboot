package com.example.springboot.dtoprojection;

import lombok.Value;

@Value
public class NamesOnlyDTO {
    String firstName;
    String lastName;
}

// Or you can replace all annotations with @Value(lombok)
// Fields are private final by default, and the class exposes a constructor
// that takes all fields and automatically gets equals(…) and hashCode() methods implemented.
