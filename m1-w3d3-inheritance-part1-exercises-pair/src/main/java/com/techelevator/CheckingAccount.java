package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		
		
		if (getBalance().minus(amountToWithdraw).getTotalAmountInCents() >= -9000) {
			
			super.withdraw(amountToWithdraw);
			
			if (getBalance().isNegative()) {
				
				super.withdraw(new DollarAmount(1000));
			}
		
		}
		
		return getBalance();
		
	}

}
