package com.infosys.assignment.util;

import org.mapstruct.Mapper;

import com.infosys.assignment.model.Account;
import com.infosys.assignment.persistance.entity.AccountEntity;

@Mapper
public interface AccountObjectMapper {
	
	AccountEntity toAccountEntity (Account account);

}
