package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {

	HourlyWorker sut;
		
	@Before
	public void setUp() throws Exception {
		
		sut = new HourlyWorker(10);
	}

	@Test
	public void testCalculateWeeklyPayNoOvertime() {
		
		assertEquals(400, sut.calculateWeeklyPay(40), 0.0001);
		
	}

	@Test
	public void testCalculateWeeklyPayWithOvertime() {
		
		assertEquals(415, sut.calculateWeeklyPay(41), 0.0001);
		
	}
	
	@Test
	public void testCalculateWeeklyPayZero() {
		
		assertEquals(0, sut.calculateWeeklyPay(0), 0.0001);
		
	}
	
	@Test
	public void testCalculateWeeklyPayNegative() {
		
		assertEquals(0, sut.calculateWeeklyPay(-1), 0.0001);
		
	}
}
