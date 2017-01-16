package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
