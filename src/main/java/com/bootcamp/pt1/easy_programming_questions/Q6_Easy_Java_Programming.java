package com.bootcamp.pt1.easy_programming_questions;

public class Q6_Easy_Java_Programming {

	// Q6: Write a Java program to check if a given string is a palindrome or not.

	public static void main(String[] args) {
		String input = "level"; // Hardcoded string

		boolean isPalindrome = isPalindrome(input);

		System.out.println(
				isPalindrome ? "\"" + input + "\" is a palindrome." : "\"" + input + "\" is not a palindrome.");
	}

	private static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
