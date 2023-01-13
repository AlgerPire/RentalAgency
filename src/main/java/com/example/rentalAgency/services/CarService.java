package com.example.rentalAgency.services;

import com.example.rentalAgency.model.Car;
import com.example.rentalAgency.dto.CarDTO;
//import com.example.rentalAgency.dto.CarDTO;

import java.util.List;

public interface CarService {

    Car save(Car car);

    Car updateCar(Long id, Car car);

    void deleteCarById(Long id);

    List<Car> findAll();

    List<Car> findAllAutomatic();

    List<Car> findAllByModel(String name);

    Iterable<CarDTO> findAllDto();




}
