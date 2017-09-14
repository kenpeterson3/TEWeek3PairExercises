package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {
	
	SalaryWorker sut;
	

	@Before
	public void setUp() throws Exception {
		
		sut = new SalaryWorker(52000);
		
	}

	@Test
	public void testCalculateWeeklyPay() {
		
		assertEquals(1000, sut.calculateWeeklyPay(0),0.00001);
		
	}

}
