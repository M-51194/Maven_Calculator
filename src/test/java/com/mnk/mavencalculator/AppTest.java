package com.mnk.mavencalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	private static double Epsilon = 0.000000000003;
	private static App a;
	
	@Before
	public void beforeEachTest() {
		System.out.println("Test Started");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("Test End");
	}
	
	@Test
	public void testAddition() {
		assertEquals(3.3, a.addition(1.1, 2.2), Epsilon);
	}
	
	@Test
	public void testSubstract() {
		assertEquals(2.0, a.substracation(6.0, 4.0), Epsilon);
	}
	
	@Test
	public void testModulus() {
		assertEquals(2.0, a.modulus(6.0, 4.0), Epsilon);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(24.0, a.multiplication(6.0, 4.0),Epsilon);
	}

	@Test
	public void testDivide() {
		assertEquals(1.50,a.diivision(6.0, 4.0), Epsilon);
	}
}
