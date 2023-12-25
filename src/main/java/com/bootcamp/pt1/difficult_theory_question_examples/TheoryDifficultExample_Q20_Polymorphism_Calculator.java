package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q20_Polymorphism_Calculator {

	// Q20: What is polymorphism in Java? Explain with an example.

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		TheoryDifficultExample_Q20_Polymorphism_Calculator calculator = new TheoryDifficultExample_Q20_Polymorphism_Calculator();
		System.out.println(calculator.add(1, 2)); // Calls the first add method
		System.out.println(calculator.add(1.5, 2.5)); // Calls the second add method
	}
}
