package com.Calculator;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		Logger log = Logger.getLogger("CalculatorApplication.class");

	}

}
