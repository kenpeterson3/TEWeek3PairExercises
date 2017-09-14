package com.techelevator;

public class SavingsAccount extends BankAccount {
	
public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		
		
		if (!getBalance().minus(amountToWithdraw).isNegative()) {
			
			if (getBalance().getTotalAmountInCents() < 15000 && getBalance().minus(amountToWithdraw).getTotalAmountInCents() >= 200) {
				
				super.withdraw(new DollarAmount(200));
				
			} else if (getBalance().getTotalAmountInCents() < 15000){ 
				
				return getBalance();				
			}
			super.withdraw(amountToWithdraw);
			
			
			
		}
		
		return getBalance();
		
	}

}
