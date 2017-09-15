package com.techelevator;

public abstract class BankAccount {
	
	private String accountNumber;
	private DollarAmount balance = new DollarAmount(0);
	
	public BankAccount(){} //constructor
	
	//methods
	
	public DollarAmount deposit(DollarAmount amountToDeposit) {
		
		if (amountToDeposit.getTotalAmountInCents() > 0) {
		balance = balance.plus(amountToDeposit);
		}
		return balance;
		
	}
	
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if (amountToWithdraw.getTotalAmountInCents() > 0) {
		balance = balance.minus(amountToWithdraw);
		}
		return balance;
		
	}
	
	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount) {
		
		withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);	
		
	}
	
	
	
	
	
	
	
	
	//getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public DollarAmount getBalance() {
		return balance;
	}
	
	

}
