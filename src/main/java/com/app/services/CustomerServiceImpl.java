package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Customer;
import com.app.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer getCustomerById(Integer id) {
		return customerRepository.findOne(id);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerRepository.delete(id);
	}

	@Override
	public Iterable<Customer> listAllCustomers() {
		return customerRepository.findAll();
	}

}
