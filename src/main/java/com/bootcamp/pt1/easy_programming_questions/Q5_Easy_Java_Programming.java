package com.bootcamp.pt1.easy_programming_questions;

public class Q5_Easy_Java_Programming {

	// Q5: Write a Java program to check if a given number is prime or not.

	public static void main(String[] args) {

		// Hardcoded number to check for primality
		int number = 17;

		// Check if the number is prime
		boolean isPrime = isPrimeNumber(number);

		// Print the result to the console
		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	// Function to check if a number is prime
	private static boolean isPrimeNumber(int num) {
		// Check for special cases
		if (num <= 1) {
			return false;
		}

		// Check for divisors up to the square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				// Found a divisor, not a prime number
				return false;
			}
		}

		// If no divisors found, it's a prime number
		return true;
	}
}
