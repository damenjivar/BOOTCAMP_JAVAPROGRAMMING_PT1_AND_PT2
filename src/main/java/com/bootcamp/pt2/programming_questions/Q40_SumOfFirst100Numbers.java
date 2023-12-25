package com.bootcamp.pt2.programming_questions;

public class Q40_SumOfFirst100Numbers {

	// Q40: Write a java program to find the sum of first 100 numbers using for
	// loop.

	public static void main(String[] args) {
		// variable to store the sum
		int sum = 0;

		// using a for loop to iterate through numbers from 1 t0 100
		for (int i = 1; i <= 100; i++) {
			// accumulate the sum
			sum += i;
		}

		// print the sum
		System.out.println("sum of the first 100 numbers: " + sum);
	}
}