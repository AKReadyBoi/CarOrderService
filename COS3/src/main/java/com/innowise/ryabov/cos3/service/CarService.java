package com.innowise.ryabov.cos3.service;

import com.innowise.ryabov.cos3.controller.CarController;
import com.innowise.ryabov.cos3.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    List<Car> getAllCars();
}
