package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
