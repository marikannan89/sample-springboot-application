package com.infosys.assignment.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.assignment.persistance.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
	
}
