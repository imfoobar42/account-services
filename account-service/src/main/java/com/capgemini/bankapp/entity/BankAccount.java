package com.capgemini.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int acccountId;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAcccountId() {
		return acccountId;
	}

	public void setAcccountId(int acccountId) {
		this.acccountId = acccountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
}
