package com.bootcamp.pt1.easy_programming_questions;

public class Q7_Easy_Java_Programming {

	// Q7: Write a Java program to reverse a given string.

	public static void main(String[] args) {
		String input = "Hello, World!"; // hardcoded string

		String reversedString = reverseString(input);

		System.out.println("Original String: " + input);
		System.out.println("Reverse String: " + reversedString);
	}

	private static String reverseString(String str) {
		// Using StringBuilder to efficiently reverse the string
		return new StringBuilder(str).reverse().toString();
	}
}
