package com.example.springboot_class.Entity;


import javax.persistence.*;

@Table
@Entity
public class TestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public TestTable() {
    }
}