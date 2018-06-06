package com.stackroute.maverick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.maverick.domain.User;
import com.stackroute.maverick.service.KafkaProducer;
import com.stackroute.maverick.service.UserService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    KafkaProducer producer;
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user) {
		System.out.println(user);
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.OK);
	}

	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> findUserbyId(@PathVariable(value = "id") String id) {
		int userId = Integer.parseInt(id);
		System.out.println(userId);
		User u = userService.getUser(userId);
		producer.sendUser(u);
		System.out.println("after service call:" + u.getUserId());
		return new ResponseEntity<User>(userService.getUser(userId), HttpStatus.OK);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping("/getAll")
	public ResponseEntity findAllUser() {
		userService.getAllUser();
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
	public ResponseEntity deleteUser(@PathVariable(value = "id") String id, User user) {
		int userId = Integer.parseInt(id);
		user.setUserId(userId);
		System.out.println(userId);
		return new ResponseEntity<>(userService.deleteUser(user), HttpStatus.OK);
	}

	// @CrossOrigin
	// @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT)
	// public ResponseEntity updateUser( @RequestBody User user) {
	// //@PathVariable(value = "id") String id,
	// //int userId = Integer.parseInt(id);
	// //System.out.println(userId);
	// System.out.print("User Data" + user.getUserName());
	// user.setUserId(user.getUserId());
	// user.setUserName(user.getUserName());
	// int userId = user.getUserId();
	// return new ResponseEntity<>(service.updateUserData(userId, user),
	// HttpStatus.OK);
	// }

	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		System.out.println("User Update Data : " + user.getImage());
		return userService.updateUserData(user);
	}
}