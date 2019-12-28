package com.infosys.assignment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.assignment.model.User;
import com.infosys.assignment.persistance.entity.UserEntity;
import com.infosys.assignment.service.UserService;

@RestController
public class UserController {
	
	@Autowired
    UserService userService;
	
	@GetMapping(path = "/users")
    public ResponseEntity<?> getUsers() {
        Iterable<UserEntity> response = userService.getUsers();
        return new ResponseEntity<Iterable<UserEntity>>(response, HttpStatus.OK);
    }
	
	@PostMapping("/users")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
		UserEntity response = userService.createUser(user);
        return new ResponseEntity<UserEntity>(response, HttpStatus.CREATED);
    }
	
	@GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable(value = "id") String userId) {
		UserEntity response = userService.findUser(userId);
        return new ResponseEntity<UserEntity>(response, HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> updateUser(@PathVariable(value = "id") String userId, @Valid @RequestBody User userDetails) {
    	UserEntity response = userService.updateUser(userId,userDetails);
        return new ResponseEntity<UserEntity>(response, HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") String userId) {
    	UserEntity response = userService.deleteUser(userId);
        return new ResponseEntity<UserEntity>(response, HttpStatus.OK);
    }

}
