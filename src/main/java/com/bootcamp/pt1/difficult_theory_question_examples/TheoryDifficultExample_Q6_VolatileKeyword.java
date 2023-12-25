package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q6_VolatileKeyword {

	// Q6: What is the purpose of the volatile keyword in Java? Provide an example
	// to explain its use.

	private volatile boolean flag = false;

	public void setFlagTrue() {
		flag = true;
	}

	public boolean isFlag() {
		return flag;
	}
}
