package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.Car;
import com.app.services.CarService;

@Controller
public class CarController {
	
	private CarService carService;
	
	@Autowired
	public void CarControler(CarService carService){
		this.carService = carService;
	}
	
	@RequestMapping("/car/new")
	public String newCar(Model model){
		model.addAttribute("car", new Car());
		return "carform";
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.POST)
	public String saveCar(Car car){
		carService.saveCar(car);
		return "redirect:/car/show/"+car.getCarId();
	}
	
	@RequestMapping("/car/delete/{id}")
	public String deleteCar(@PathVariable Integer id){
		carService.deleteCar(id);
		return "redirect:/cars";
	}
	
	@RequestMapping("/car/edit/{id}")
	public String editCar(@PathVariable Integer id, Model model){
		model.addAttribute("car", carService.getCarById(id));
		return "carform";
	}
	
	@RequestMapping("/car/show/{id}")
	public String showCar(@PathVariable Integer id, Model model){
		model.addAttribute("car", carService.getCarById(id));
		return "carshow";
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String listCars(Model model){
		model.addAttribute("cars", carService.listAllCars());
		return "cars";
	}
	

}
