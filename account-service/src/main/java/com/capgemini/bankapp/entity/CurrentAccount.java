package com.capgemini.bankapp.entity;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.JOINED)
public class CurrentAccount extends BankAccount {

	private double odLimit;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrentAccount(String accountHolderName, double accountBalance, String accountType,double odLimit) {
		super(accountHolderName, accountBalance, accountType);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}
	
}
