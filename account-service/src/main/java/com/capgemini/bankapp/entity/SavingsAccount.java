package com.capgemini.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.JOINED)
public class SavingsAccount extends BankAccount{
	
	private boolean Salary;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isSalary() {
		return Salary;
	}

	public void setSalary(boolean salary) {
		Salary = salary;
	}

	public SavingsAccount(boolean salary) {
		super();
		Salary = salary;
	} 
	
}
