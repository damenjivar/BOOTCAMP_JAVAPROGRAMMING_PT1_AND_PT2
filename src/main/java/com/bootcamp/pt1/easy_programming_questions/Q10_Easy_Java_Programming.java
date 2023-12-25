package com.bootcamp.pt1.easy_programming_questions;

import java.util.Random;

public class Q10_Easy_Java_Programming {

	// Q10: Write a Java program to generate a random number between 1 and 100.

	public static void main(String[] args) {
		// Create a Random object
		Random random = new Random();

		// Generate a random number between 1 and 100
		int randomNumber = random.nextInt(100) + 1;

		// Print the random number to the console
		System.out.println("Random number between 1 and 100: " + randomNumber);
	}
}
