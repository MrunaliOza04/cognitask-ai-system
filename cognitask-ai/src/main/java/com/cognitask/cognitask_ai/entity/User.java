package com.cognitask.cognitask_ai.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity  // it will tell spring to create a table from this class
@Data
public class User {

    @Id // to make primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true) // for creating unique email id
    private String email;

    private String password;
    private String role;
}
