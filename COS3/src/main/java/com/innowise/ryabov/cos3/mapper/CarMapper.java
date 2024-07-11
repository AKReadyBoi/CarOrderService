package com.innowise.ryabov.cos3.mapper;

import com.innowise.ryabov.cos3.dto.CarDto;
import com.innowise.ryabov.cos3.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public CarDto carDto(Car car) {
        return new CarDto(car.getBrand(), car.getModel());
    }
}
