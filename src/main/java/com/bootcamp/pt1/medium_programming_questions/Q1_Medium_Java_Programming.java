package com.bootcamp.pt1.medium_programming_questions;

public class Q1_Medium_Java_Programming {

	public static void main(String[] args) {
		int number = 5; // replace 5 with the desired non-negative integer

		if (number < 0) {
			System.out.println("Please enter a non-negative integer");
		} else {
			long factorial = calculateFactorial(number);
			System.out.println("Factorial of " + number + " = " + factorial);
		}
	}

	private static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);
		}
	}
}
