package com.Calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Calci")
public class CalculatorController {

	@GetMapping(value = "/Sum")
	public int sum(@PathVariable int a, int b) {
		return a + b;
	}

	@GetMapping(value = "/Sub")
	public int sub(@PathVariable int a, int b) {
		return a - b;
	}

	@GetMapping(value = "/Mul")
	public int mul(@PathVariable int a, int b) {
		return a * b;
	}

	@GetMapping(value = "/Div")
	public int div(@PathVariable int a, int b) {
		return a / b;
	}

}
