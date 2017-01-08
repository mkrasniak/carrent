package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.models.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
