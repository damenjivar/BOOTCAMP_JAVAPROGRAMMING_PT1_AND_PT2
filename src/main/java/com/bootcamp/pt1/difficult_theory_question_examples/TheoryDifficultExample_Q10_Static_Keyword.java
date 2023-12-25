package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q10_Static_Keyword {

	// Q10: What is the purpose of the static keyword in Java? Provide an example to
	// explain its use.

	static int instanceCount = 0; // Shared variable

	TheoryDifficultExample_Q10_Static_Keyword() {
		instanceCount++; // Incremented for each instance created
	}

	static void printInstanceCount() { // Shared method
		System.out.println("Number of instances: " + instanceCount);
	}

	public static void main(String[] args) {
		new TheoryDifficultExample_Q10_Static_Keyword();
		new TheoryDifficultExample_Q10_Static_Keyword();
		TheoryDifficultExample_Q10_Static_Keyword.printInstanceCount(); // Calling the method directly
	}
}
