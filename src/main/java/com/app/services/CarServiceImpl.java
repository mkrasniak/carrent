package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.app.models.Car;
import com.app.models.User;
import com.app.repositories.CarRepository;

@Service
public class CarServiceImpl implements CarService {

	private CarRepository carRepository;

	@Autowired
	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public Car getCarById(Integer id) {
		return carRepository.findOne(id);
	}

	@Override
	public Car saveCar(Car car) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		car.setUser(user);
		return carRepository.save(car);
	}

	@Override
	public void deleteCar(Integer id) {
		carRepository.delete(id);
	}

	@Override
	public Iterable<Car> listAllCars() {
		return carRepository.findAll();
	}

}
