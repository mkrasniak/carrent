package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.User;
import com.app.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findOne(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.delete(id);
	}

	@Override
	public Iterable<User> listAllUsers() {
		return userRepository.findAll();
	}
}
