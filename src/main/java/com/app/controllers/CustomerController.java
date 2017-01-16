package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.Customer;
import com.app.services.CustomerService;

@Controller
public class CustomerController {

private CustomerService customerService;
	
	@Autowired
	public void CustomerControler(CustomerService customerService){
		this.customerService = customerService;
	}
	
	@RequestMapping("/customer/new")
	public String newCustomer(Model model){
		model.addAttribute("customer", new Customer());
		return "customerform";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String saveCustomer(Customer customer){
		customerService.saveCustomer(customer);
		return "redirect:/customer/show/"+customer.getCustomerId();
	}
	
	@RequestMapping("/customer/delete/{id}")
	public String deleteCustomer(@PathVariable Integer id){
		customerService.deleteCustomer(id);
		return "redirect:/customers";
	}
	
	@RequestMapping("/customer/edit/{id}")
	public String editCustomer(@PathVariable Integer id, Model model){
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "customerform";
	}
	
	@RequestMapping("/customer/show/{id}")
	public String showCustomer(@PathVariable Integer id, Model model){
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "customershow";
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String listCustomers(Model model){
		model.addAttribute("customers", customerService.listAllCustomers());
		return "customers";
	}
}
