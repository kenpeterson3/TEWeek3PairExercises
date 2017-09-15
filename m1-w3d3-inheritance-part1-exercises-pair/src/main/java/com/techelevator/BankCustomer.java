package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount> accounts = new ArrayList<>();
	
	
	//constructors
	public BankCustomer(){}
	
	public BankCustomer(String name, String address, String phoneNumber) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}
	
	//method
	public void addAccount(BankAccount newAccount) {
		
		accounts.add(newAccount);
		
	}
	
	public boolean isVIP() {
		
		int verifyImportantPerson = 0;
		for ( BankAccount currentAccountBalance : accounts) {
			
			verifyImportantPerson += currentAccountBalance.getBalance().getTotalAmountInCents();
			
		}
		
		return verifyImportantPerson >= 2500000;
		
	}
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	
	//
	
}
