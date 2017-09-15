package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	
	BankCustomer sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new BankCustomer ("Yoda", "Dagobah", "17000643424"); //phone number is Yoda's Midichlorian count
		
	}

	@Test
	public void testAddAccount() {
		
		sut.addAccount(new SavingsAccount());
		sut.addAccount(new CheckingAccount());
		assertEquals(2, sut.getAccounts().size());
		
	}
	@Test
	public void testConstructor() {
		
		assertEquals("Yoda", sut.getName());
		assertEquals("Dagobah", sut.getAddress());
		assertEquals("17000643424", sut.getPhoneNumber());
		
	}
	
	@Test
	public void testVIP() {
		
		sut.addAccount(new SavingsAccount());
		sut.addAccount(new CheckingAccount());
		sut.getAccounts().get(0).deposit(new DollarAmount(2000000));
		sut.getAccounts().get(1).deposit(new DollarAmount(2000000));
		assertTrue(sut.isVIP());
		
	}
	
	@Test
	public void testNotVIP() {
		
		sut.addAccount(new SavingsAccount());
		sut.addAccount(new CheckingAccount());
		sut.getAccounts().get(0).deposit(new DollarAmount(1000000));
		sut.getAccounts().get(1).deposit(new DollarAmount(1000000));
		assertFalse(sut.isVIP());
		
	}
	
	@Test
	public void testEdgeCaseVIP() {
		
		sut.addAccount(new SavingsAccount());
		sut.addAccount(new CheckingAccount());
		sut.getAccounts().get(0).deposit(new DollarAmount(2000000));
		sut.getAccounts().get(1).deposit(new DollarAmount(500000));
		assertTrue(sut.isVIP());
		
	}
	
}
