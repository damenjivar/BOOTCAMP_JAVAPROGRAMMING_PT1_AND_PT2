package com.bootcamp.pt2.programming_questions;

public class Q39_EvenNumbersExample {

	// Q39: Java program for printing even numbers between 1 and 100 using for loop.

	public static void main(String[] args) {
		// Using a for loop to iterat through numbers from 1 to 100
		System.out.println("Even numbers between 1 and 100:");

		for (int i = 1; i <= 100; i++) {
			// check if the current number is even
			if (i % 2 == 0) {
				// Print the even number
				System.out.println(i + " ");
			}
		}
	}
}