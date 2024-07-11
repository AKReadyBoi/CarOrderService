package com.innowise.ryabov.cos3.service.serviceImpl;

import com.innowise.ryabov.cos3.entity.Car;
import com.innowise.ryabov.cos3.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService implements com.innowise.ryabov.cos3.service.CarService {
    CarRepository repository;
    public CarService(CarRepository carRepository) {
        this.repository = carRepository;
    }
    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }
}
