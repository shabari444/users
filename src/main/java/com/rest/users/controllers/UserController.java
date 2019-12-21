package com.rest.users.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.users.VO.User;
import com.rest.users.repository.UserRepository;

@RestController
public class UserController {
	
@Autowired
private UserRepository userRepository;
	
	
@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET) 
public List<User> getAllUsers(){
	
	return userRepository.findAll();
}

@RequestMapping(value = "/createUser", method = RequestMethod.POST) 
public void createUser(@RequestBody User user){
	userRepository.save(user);
}

@RequestMapping(value = "/getUser/{userID}", method = RequestMethod.GET)

public Optional<User> getUserbyID(@PathVariable Long userID) {
	return userRepository.findById(userID);
}

@RequestMapping(value = "/deleteUser/{userID}",method = RequestMethod.DELETE)
public void deleteUser(@PathVariable Long userID) {
	userRepository.deleteById(userID);
}

}

