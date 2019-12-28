package com.infosys.assignment.service;

import com.infosys.assignment.persistance.entity.AccountEntity;

public interface AccountService {

	Iterable<AccountEntity> getAccountDetails();
	
	AccountEntity getAccountDetails(String userId);

}
