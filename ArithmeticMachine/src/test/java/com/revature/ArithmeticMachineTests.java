package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticMachineTests {

	// Have your references outside of your test, but remember to set up and clean up for every test
	ArithmeticMachine machine = new ArithmeticMachine();
	
	// The @Test annotation marks a method as a test method to be run by a test runner
	// A test runner is a program that runs test methods and reports the results
	@Test
	public void myFirstTest() {
		
		// 'Empty' references - which reference nothing - contain a value called 'null'
		assertNotNull(machine);
	}
	
	@Test
	public void mySecondTest() {
		int x = machine.add(2, 3); // Should equal 5
		
		// When any assertions are not true, the test fails
		assertNotEquals(x, 0);
		assertEquals(x, 5);
		
		// Can also test boolean statements
		assertTrue(x == 5);
	}
	
	@Test
	public void myThirdTest() {
		assertThrows(ArithmeticException.class, () -> machine.divide(1, 0));
	}
	
	// The @BeforeEach annotation marks a method that should run before each test is run
	@BeforeEach
	public void setupEachTest() {
		
		machine = new ArithmeticMachine();
		System.out.println("Im in a before each!");
	}
	
	@AfterEach
	public void cleanupEachTest() {
		System.out.println("In an after each!");
	}
	
	@BeforeAll
	public static void setupAllTests() {
		System.out.println("Im in a before all!");
	}
	
	@AfterAll
	public static void cleanupForAllTests() {
		System.out.println("Im in an after all!");
	}
}
