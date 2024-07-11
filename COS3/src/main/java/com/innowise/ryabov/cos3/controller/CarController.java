package com.innowise.ryabov.cos3.controller;

import com.innowise.ryabov.cos3.entity.Car;
import com.innowise.ryabov.cos3.service.UserService;
import com.innowise.ryabov.cos3.service.serviceImpl.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    CarService service;
    public CarController(CarService service) {
        this.service = service;
    }
    @GetMapping("/getCars")
    public ResponseEntity<String> getAllCars() {
        return ResponseEntity.ok(service.getAllCars().toString());
    }
}
