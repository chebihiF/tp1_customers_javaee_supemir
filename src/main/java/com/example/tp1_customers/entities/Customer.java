package com.example.tp1_customers.entities;

import lombok.*;
import javax.persistence.*;

@Entity @Table(name="client")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nom", unique = true)
    private String name ;
    private String email ;
}
