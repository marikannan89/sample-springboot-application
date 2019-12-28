package com.infosys.assignment.service.impl;

import javax.transaction.Transactional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.assignment.exception.ResourceNotFoundException;
import com.infosys.assignment.model.User;
import com.infosys.assignment.persistance.dao.UserRepository;
import com.infosys.assignment.persistance.entity.UserEntity;
import com.infosys.assignment.service.UserService;
import com.infosys.assignment.util.UserObjectMapper;

import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserRepository userRepository;
	
	UserObjectMapper userObjectMapper = Mappers.getMapper(UserObjectMapper.class);
	
	@Override
	public Iterable<UserEntity> getUsers() {
		return userRepository.findAll(); 
	}
	
	@Override
	public UserEntity createUser(User user) {
		return userRepository.save(userObjectMapper.toUserEntity(user)); 
	}

	@Override
	public UserEntity findUser(String userId) {
		return userRepository.findById(Long.valueOf(userId)).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
	}

	@Override
	public UserEntity updateUser(String userId, User userDetails) {
		UserEntity userEntity = userRepository.findById(Long.valueOf(userId)).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
		userEntity = userObjectMapper.toUserEntity(userDetails);
		userEntity.setUserId(Long.valueOf(userId));
        return userRepository.save(userEntity);
	}

	@Override
	public UserEntity deleteUser(String userId) {
		UserEntity user = userRepository.findById(Long.valueOf(userId)).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
		userRepository.delete(user);
		return user;
	}

}
