package com.app.services;

import com.app.models.User;

public interface UserService {

    User getUserById(Integer id);

    User saveUser(User user);

    void deleteUser(Integer id);	
    
    Iterable<User> listAllUsers();

}
