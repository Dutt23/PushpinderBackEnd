//package com.stackroute.maverick.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.stackroute.maverick.domain.UserLogin;
//import com.stackroute.maverick.service.UserLoginService;
//
//@RestController
//@RequestMapping("/api/u1")
//@CrossOrigin(origins = "*")
//public class UserLoginController {
//
//	@Autowired
//	private UserLoginService service;
//
//	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
//	public ResponseEntity<UserLogin> addUserLogin(@RequestBody UserLogin restaurant) {
//		System.out.println(restaurant);
//		return new ResponseEntity<UserLogin>(service.addUserLogin(restaurant), HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
//	public ResponseEntity getAllUserLogin() {
//		return new ResponseEntity<>(service.getAllUserLogin(), HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
//	public ResponseEntity findUserLoginbyId(@PathVariable(value = "id") String id) {
//		int restaurantId = Integer.parseInt(id);
//		System.out.println(restaurantId);
//		return new ResponseEntity<>(service.getUserLogin(restaurantId), HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
//	public ResponseEntity deleteUserLogin(@PathVariable(value = "id") String id, UserLogin userLogin) {
//		int userLoginId = Integer.parseInt(id);
//		userLogin.setUserId(userLoginId);
//		System.out.println(userLoginId);
//		return new ResponseEntity<>(service.deleteUserLogin(userLogin), HttpStatus.OK);
//
//	}
//	
//	@RequestMapping(value = "/updateUserLogin/{id}", method = RequestMethod.PUT)
//	public ResponseEntity updateUserLogin(@PathVariable(value = "id") String id, @RequestBody UserLogin restaurant) {
//		int restaurantId = Integer.parseInt(id);
//		System.out.println(restaurantId);
//		return new ResponseEntity<>(service.updateUserLoginById(restaurantId, restaurant), HttpStatus.OK);
//
//	}
//
//}