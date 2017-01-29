package com.app.services;

import com.app.models.Rent;

public interface RentService {

    Rent getRentById(Integer id);

    Rent saveRent(Rent rent);

    void deleteRent(Integer id);	
    
    Iterable<Rent> listAllRents();
}
