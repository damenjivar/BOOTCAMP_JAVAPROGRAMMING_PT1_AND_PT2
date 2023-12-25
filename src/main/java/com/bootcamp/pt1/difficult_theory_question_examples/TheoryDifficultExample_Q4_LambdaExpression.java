package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q4_LambdaExpression {

	public static void main(String[] args) {
		lambdaExpression();
	}

	// Q4: What is a Lambda expression in Java? Provide an example to explain its
	// use.
	public static void lambdaExpression() {
		//No parameter Lambda expression
		Runnable lambda = () -> System.out.println("Hello, World!");
		lambda.run();
	}
}