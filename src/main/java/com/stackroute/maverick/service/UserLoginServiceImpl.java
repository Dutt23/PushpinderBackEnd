//package com.stackroute.maverick.service;
//
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.stackroute.maverick.domain.UserLogin;
//import com.stackroute.maverick.repository.UserLoginRepository;
//
//
//@Service
//public class UserLoginServiceImpl implements UserLoginService {
//
//	@Autowired
//	private UserLoginRepository repo;
//
//	@Override
//	public UserLogin addUserLogin(UserLogin userLogin) {
//		return repo.save(userLogin);
//	}
//
//	@Override
//	public UserLogin updateUserLoginById(int userId, UserLogin userLogin) {
//		return repo.save(userLogin);
//	}
//
//	@Override
//	public UserLogin deleteUserLogin(UserLogin userLogin) {
//		repo.deleteById(userLogin.getUserId());
//		return userLogin;
//	}
//
//	@Override
//	public Optional<UserLogin> getUserLogin(int userId) {
//		return repo.findById(userId);
//
//	}
//
//	@Override
//	public Iterable<UserLogin> getAllUserLogin() {
//		return repo.findAll();
//	}
//
//}
