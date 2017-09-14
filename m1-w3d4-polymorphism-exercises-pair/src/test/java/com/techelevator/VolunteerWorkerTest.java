package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VolunteerWorkerTest {
	
	VolunteerWorker sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new VolunteerWorker();
		
	}

	@Test
	public void test() {
		
		for (int i = 0; i < 100; i++) {
			assertEquals(0,sut.calculateWeeklyPay((int)Math.random()), 0.00001); //lol
		}
	}

}
