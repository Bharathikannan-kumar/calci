package com.Calculator.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.Calculator.Controller.CalculatorController;

public class CalculatorAssert {

	CalculatorController c = new CalculatorController();

	@Test
	public void testEquals() {
		assertEquals(10, 10);
	}
	
	
	@Test
	public void testNull() {
		assertNull(null);
	}
	
	@Test
	public void testNotEquals() {
		assertNotEquals(20, 10);
	}
	@Test
	public void testNotNull() {
		assertNotNull(20);
	}

}
