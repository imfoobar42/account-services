package com.capgemini.bankapp.entity;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.JOINED)
public class SavingsAccount extends BankAccount {
	
	private boolean salary;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accountHolderName, double accountBalance, String accountType, boolean salary) {
		super(accountHolderName, accountBalance, accountType);
		this.salary = salary;
	}

	
	
	public boolean isSalary() {
		return salary;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SavingAccount [salary=" + salary + "]";
	}
	
	
	
	

}
