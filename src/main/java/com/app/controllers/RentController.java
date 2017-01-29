package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.Car;
import com.app.models.Rent;
import com.app.services.CarService;
import com.app.services.RentService;

@Controller
public class RentController {

	private RentService rentService;
	private CarService carService;

	@Autowired
	public RentController(RentService rentService, CarService carService) {
		this.rentService = rentService;
		this.carService = carService;
	}

	@RequestMapping("/rent/new")
	public String newRent(Model model){
		model.addAttribute("rent", new Rent());
		model.addAttribute("cars", carService.listAllCars());
		return "rentform";
	}

	@RequestMapping(value = "/rent", method = RequestMethod.POST)
	public String saveRent(Rent rent) {
		rentService.saveRent(rent);
		return "redirect:/rent/show/" + rent.getRentId();
	}

	@RequestMapping("/rent/delete/{id}")
	public String deleteRent(@PathVariable Integer id) {
		rentService.deleteRent(id);
		return "redirect:/rents";
	}

	@RequestMapping("/rent/edit/{id}")
	public String editRent(@PathVariable Integer id, Model model) {
		model.addAttribute("rent", rentService.getRentById(id));
		return "rentform";
	}

	@RequestMapping("/rent/show/{id}")
	public String showRent(@PathVariable Integer id, Model model) {
		model.addAttribute("rent", rentService.getRentById(id));
		return "rentshow";
	}

	@RequestMapping(value = "/rents", method = RequestMethod.GET)
	public String listRents(Model model) {
		model.addAttribute("rents", rentService.listAllRents());
		return "rents";
	}

}
