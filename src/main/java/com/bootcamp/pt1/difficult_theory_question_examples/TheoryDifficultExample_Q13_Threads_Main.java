package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q13_Threads_Main extends Thread {

	public static void main(String[] args) {
		TheoryDifficultExample_Q13_Threads thread1 = new TheoryDifficultExample_Q13_Threads();
		TheoryDifficultExample_Q13_Threads thread2 = new TheoryDifficultExample_Q13_Threads();

		// Start both threads
		thread1.start();
		thread2.start();
	}
}
