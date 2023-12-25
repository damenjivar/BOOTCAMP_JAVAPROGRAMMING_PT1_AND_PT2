package com.bootcamp.pt1.medium_programming_questions;

public class Q5_Medium_Java_Programming {

	// Q5: Write a Java program to find the second highest number in an array.

	public static void main(String[] args) {
		// Sample array
		int[] numbers = { 10, 5, 7, 2, 8, 15, 12, 18 };

		// Find the second highest number
		int secondHighest = findSecondHighest(numbers);

		// Display the result
		System.out.println("Array: " + java.util.Arrays.toString(numbers));
		System.out.println("Second Highest Number: " + secondHighest);

	}

	// Function to find the second highest number in an array
	private static int findSecondHighest(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > highest) {
				// Current number is greater than the highest
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num < highest) {
				// Current number is greater than the second highest
				// but less than the highest.
				secondHighest = num;
			}
		}

		return secondHighest;
	}

}
