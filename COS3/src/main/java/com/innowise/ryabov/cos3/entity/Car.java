package com.innowise.ryabov.cos3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;

}
