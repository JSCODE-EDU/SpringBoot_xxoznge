package com.example.springboot_class.Entity;

import javax.persistence.*;

@Table(name="student")
@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    public student() {
    }
}
