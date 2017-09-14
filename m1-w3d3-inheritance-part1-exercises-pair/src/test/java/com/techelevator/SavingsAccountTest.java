package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
	
	SavingsAccount sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new SavingsAccount();
		
	}

	@Test
	public void testOverdraft() {
		
		sut.deposit(new DollarAmount(20000));
		sut.withdraw(new DollarAmount(25000));
		assertEquals(20000, sut.getBalance().getTotalAmountInCents());
		
	}

	@Test
	public void testLess150Fee() {
		
		sut.deposit(new DollarAmount(10000));
		sut.withdraw(new DollarAmount(5000));
		assertEquals(4800, sut.getBalance().getTotalAmountInCents());
		
	}

	
	@Test
	public void testLess150NoWithdraw() {
		
		sut.deposit(new DollarAmount(10000));
		sut.withdraw(new DollarAmount(10000));
		assertEquals(10000, sut.getBalance().getTotalAmountInCents());
		
		
	}
	@Test
	public void testOver150To0() {
		
		sut.deposit(new DollarAmount(20000));
		sut.withdraw(new DollarAmount(20000));
		assertEquals(0, sut.getBalance().getTotalAmountInCents());
		
	}	
	
}
