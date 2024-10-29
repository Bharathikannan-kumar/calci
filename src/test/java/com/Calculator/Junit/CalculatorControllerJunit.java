package com.Calculator.Junit;

import org.junit.jupiter.api.Test;

import com.Calculator.Controller.CalculatorController;

public class CalculatorControllerJunit {

	CalculatorController c = new CalculatorController();

	@Test
	public void testadd() {
		System.out.println(c.sum(50, 60));
	}

	@Test
	public void testsub() {
		System.out.println(c.sub(75, 10));
	}

	@Test
	public void testdiv() {
		System.out.println(c.div(1, 2));
	}

	@Test
	public void testmul() {
		System.out.println(c.mul(2, 0));
	}
}
