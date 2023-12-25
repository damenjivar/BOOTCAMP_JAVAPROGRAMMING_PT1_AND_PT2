package com.bootcamp.pt2.programming_questions;

public class Q41_NumbersDivisibleBy5 {

	// Q41: print numbers from 1 to 100. Print number and divisible by 5 text if
	// divisible.

	public static void main(String[] args) {
		// Using a for loop to iterate through numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {
			// Check if the current number is divisible by 5
			if (i % 5 == 0) {
				// Print the number and the text if divisible by 5
				System.out.println(i + " (Divisible by 5)");
			} else {
				// Print the number if not divisible by 5
				System.out.println(i);
			}
		}
	}
}
