package com.innowise.ryabov.cos3.dto;

import lombok.Data;

@Data
public class CarDto {
    private String brand;
    private String model;

    public CarDto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
