package com.bootcamp.pt1.medium_programming_questions;

public class Q10_Medium_Java_Programming {

	// Q10: Write a Java program to count the number of words in a given string.

	public static void main(String[] args) {
		// Example string
		String inputString = "This is a sample string with several words.";

		// Count the number of words
		int wordCount = countWords(inputString);

		// Display the result
		System.out.println("Number of words: " + wordCount);

	}

	// Function to count the number of words in a string
	private static int countWords(String str) {
		// Check for null or empty string
		if (str == null || str.trim().isEmpty()) {
			return 0;
		}

		// Split the string by spaces
		String[] words = str.split("\\s+");

		// Return the number of words
		return words.length;
	}
}
