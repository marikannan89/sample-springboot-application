package com.infosys.assignment.service.impl;

import javax.transaction.Transactional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.assignment.exception.ResourceNotFoundException;
import com.infosys.assignment.persistance.dao.AccountRepository;
import com.infosys.assignment.persistance.entity.AccountEntity;
import com.infosys.assignment.service.AccountService;
import com.infosys.assignment.util.AccountObjectMapper;

import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
	
	@Autowired 
	private AccountRepository accountRepository;
	
	AccountObjectMapper accountObjectMapper = Mappers.getMapper(AccountObjectMapper.class);
	
	@Override
	public Iterable<AccountEntity> getAccountDetails() {
		return accountRepository.findAll();
	}
	
	@Override
	public AccountEntity getAccountDetails(String accountId) {
		return accountRepository.findById(Long.valueOf(accountId)).orElseThrow(() -> new ResourceNotFoundException("Account", "id", accountId));
	}

}
