package com.infosys.assignment.service;

import com.infosys.assignment.model.User;
import com.infosys.assignment.persistance.entity.UserEntity;

public interface UserService {

	Iterable<UserEntity> getUsers();
	
	UserEntity createUser(User user);

	UserEntity findUser(String userId);

	UserEntity updateUser(String userId, User userDetails);

	UserEntity deleteUser(String userId);

}
