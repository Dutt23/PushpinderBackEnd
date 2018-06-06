package com.stackroute.maverick.service;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.maverick.domain.User;
import com.stackroute.maverick.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;

	@Override
	public User addUser(User user) {
		return repo.save(user);
	}
	
	@Override
	public User updateUserData(User user) {
		User userUpdate = repo.save(user);
		return userUpdate;
	}

	@Override
	public User deleteUser(User user) {
		repo.deleteById(user.getUserId());
		return user;
	}

	@Override
	public User getUser(int userId) {
		return repo.findById(userId).orElse(null);

	}

	@Override
	public Iterable<User> getAllUser() {
		return repo.findAll();
	}

}