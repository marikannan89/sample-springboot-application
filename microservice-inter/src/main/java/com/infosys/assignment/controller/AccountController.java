package com.infosys.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.assignment.persistance.entity.AccountEntity;
import com.infosys.assignment.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
    AccountService accountService;
	
	@GetMapping(path = "/account")
    public ResponseEntity<?> getAccounts() {
        Iterable<AccountEntity> response = accountService.getAccountDetails();
        return new ResponseEntity<Iterable<AccountEntity>>(response, HttpStatus.OK);
    }
	
	@GetMapping("/account/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable(value = "id") String accountId) {
		AccountEntity response = accountService.getAccountDetails(accountId);
        return new ResponseEntity<AccountEntity>(response, HttpStatus.OK);
    }

}
