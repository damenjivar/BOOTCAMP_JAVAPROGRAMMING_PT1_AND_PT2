package com.bootcamp.pt1.medium_programming_questions;

public class Q4_Medium_Java_Programming {

	// Q4: 4. Write a Java program to reverse a given string without using any
	// built-in functions.

	public static void main(String[] args) {
		// Provide the string to reverse
		String inputString = "Hello, World!";

		// Reverse the string
		String reversedString = reverseString(inputString);

		// Display the reversed string
		System.out.println("Original string: " + inputString);
		System.out.println("Reversed string: " + reversedString);

	}

	// Function to reverse a string without using built-in functions
	private static String reverseString(String input) {
		// Convert the string to a character array
		char[] charArray = input.toCharArray();

		// Swap characters from the beginning and end of the array
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) {
			// Swap characters
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;

			// Move indices towards the center
			start++;
			end--;
		}

		// Convert the character array back to a string
		return new String(charArray);
	}
}
