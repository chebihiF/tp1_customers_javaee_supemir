package com.example.tp1_customers.entities;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Customer {
    private Long id ;
    private String name ;
    private String email ;
}
