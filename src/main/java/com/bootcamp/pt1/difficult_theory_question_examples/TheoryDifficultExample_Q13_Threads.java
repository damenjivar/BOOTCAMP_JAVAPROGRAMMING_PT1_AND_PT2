package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q13_Threads extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}
	}
}
