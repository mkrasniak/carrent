package com.app.services;

import com.app.models.Customer;

public interface CustomerService {
	
    Customer getCustomerById(Integer id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Integer id);	
    
    Iterable<Customer> listAllCustomers();

}
