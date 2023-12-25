package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q9_Exceptions {

	// Q9: What is an exception in Java? Provide an example to explain the concept.

	public static void main(String[] args) {
		arithmeticExceptionExample();
	}

	public static void arithmeticExceptionExample() {
		int numerator = 10;
		int denominator = 0;

		try {
			// Attempting to divide by zero, which will cause an ArithmeticException
			int result = numerator / denominator;
			System.out.println("Result: " + result); // This line won't be reached
		} catch (ArithmeticException e) {
			// Exception handling block
			System.out.println("An arithmetic exception occurred: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Program continues after handling the exception");
	}
}