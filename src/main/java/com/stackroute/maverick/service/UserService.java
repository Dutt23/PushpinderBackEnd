package com.stackroute.maverick.service;

import com.stackroute.maverick.domain.User;

public interface UserService {

	public User addUser(User user);

	public User updateUserData(User user);

	public User deleteUser(User user);

	public User getUser(int userId);

	public Iterable<User> getAllUser();

}
