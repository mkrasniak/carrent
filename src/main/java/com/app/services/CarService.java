package com.app.services;

import com.app.models.Car;

public interface CarService {

    Car getCarById(Integer id);

    Car saveCar(Car car);

    void deleteCar(Integer id);	
    
    Iterable<Car> listAllCars();

}
