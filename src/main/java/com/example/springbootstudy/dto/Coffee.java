package com.example.springbootstudy.dto;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private String id;

    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public Coffee() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}