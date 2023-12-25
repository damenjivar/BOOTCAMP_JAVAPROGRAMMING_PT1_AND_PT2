package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q18_Assertions {

	public static void main(String[] args) {

		int value = -5;
		assert value >= 0 : "Value should be non-negative"; // Throws AssertionError if false
		System.out.println("Value is: " + value);
	}
}
