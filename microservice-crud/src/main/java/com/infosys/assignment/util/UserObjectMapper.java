package com.infosys.assignment.util;

import org.mapstruct.Mapper;

import com.infosys.assignment.model.User;
import com.infosys.assignment.persistance.entity.UserEntity;

@Mapper
public interface UserObjectMapper {
	
	UserEntity toUserEntity (User user);

}
