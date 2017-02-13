package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Rent;

public interface RentRepository extends JpaRepository<Rent, Integer> {

}
