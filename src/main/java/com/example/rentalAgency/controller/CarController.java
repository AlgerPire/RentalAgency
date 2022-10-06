package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Car;
import com.example.rentalAgency.services.implementation.CarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarImpl carImpl;

    @PostMapping("/addCar")
    public ResponseEntity<Car> addCar(Car car){
        Car car1=carImpl.save(car);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }
}
