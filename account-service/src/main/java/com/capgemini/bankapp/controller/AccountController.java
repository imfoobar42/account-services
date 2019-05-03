package com.capgemini.bankapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bankapp.entity.BankAccount;

@RestController
public class AccountController {
	
	@PostMapping("/account")
	public ResponseEntity<BankAccount> addNewAccount(@RequestBody BankAccount account){
		return null;
	}
	
	@PutMapping("/account")
	public ResponseEntity<BankAccount> updateAccount(@RequestBody BankAccount account){
		return null;
	}
}
