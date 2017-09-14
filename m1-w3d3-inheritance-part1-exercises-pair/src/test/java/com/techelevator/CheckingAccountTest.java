package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
	
	CheckingAccount sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new CheckingAccount();
		
	}

	@Test
	public void testGoodWithdraw() {
		
		sut.deposit(new DollarAmount(100));
		sut.withdraw(new DollarAmount(99));
		assertEquals(1,sut.getBalance().getTotalAmountInCents());
		
	}
	@Test
	public void testBadWithdraw() {
		
		sut.deposit(new DollarAmount(100));
		sut.withdraw(new DollarAmount(101));
		assertEquals(-1001,sut.getBalance().getTotalAmountInCents());
		
		
	}
	
	@Test
	public void testUglyWithdraw() {
		
		sut.withdraw(new DollarAmount(9001));
		assertEquals(0,sut.getBalance().getTotalAmountInCents());
		
	}
	
	@Test
	public void testBoundryBadWithdraw() {
		
		sut.withdraw(new DollarAmount(9000));
		assertEquals(-10000,sut.getBalance().getTotalAmountInCents());
		
		
	}
	
}
