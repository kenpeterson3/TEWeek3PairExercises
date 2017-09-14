package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DollarAmountTest {
	
	DollarAmount sut;
	
	@Before
	public void setUp() throws Exception {
		
		sut = new DollarAmount(350);
		
	}

	@Test
	public void testMinus() {
		
		sut = sut.minus(new DollarAmount(349));
		assertEquals(1, sut.getCents());
		
		
	}
	@Test
	public void testPlus() {
		
		sut = sut.plus(new DollarAmount(125));
		assertEquals(75, sut.getCents());
		assertEquals(4, sut.getDollars());
		
	}
	@Test
	public void testToString() {
		
		assertEquals("$3.50",sut.toString());
		sut = new DollarAmount(-350);
		assertEquals("-$3.50",sut.toString());
		
	}
	@Test
	public void testIsNegative() {
		
		assertEquals(false,sut.isNegative());
		DollarAmount sutTwo = new DollarAmount(-1);
		assertTrue(sutTwo.isNegative());
		
	}
	@Test
	public void testCompareTo() {
		
		assertEquals(-1, sut.compareTo(new DollarAmount(351)));
		assertEquals(1, sut.compareTo(new DollarAmount(349)));
		assertEquals(0, sut.compareTo(new DollarAmount(350)));
	}
	

}
