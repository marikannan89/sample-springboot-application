package com.infosys.assignment.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.assignment.persistance.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Long> {
	
}
