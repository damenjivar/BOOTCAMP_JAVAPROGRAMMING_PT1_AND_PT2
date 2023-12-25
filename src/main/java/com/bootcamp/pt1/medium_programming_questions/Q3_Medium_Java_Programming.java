package com.bootcamp.pt1.medium_programming_questions;

public class Q3_Medium_Java_Programming {

	// Q3: Write a java program to check if a given string is a palindrome or not.

	public static void main(String[] args) {
		String inputString = "level"; // Replace "level" with any string you want

		if (isPalindrome(inputString)) {
			System.out.println("\"" + inputString + "\" is a palindrome.");
		} else {
			System.out.println("\"" + inputString + "\" is not a palindrome.");
		}
	}

	private static boolean isPalindrome(String str) {
		// Remove spaces and convert the string to lowercase for case-insensitive
		String cleanedString = str.replaceAll("\\s", "").toLowerCase();

		int left = 0;
		int right = cleanedString.length() - 1;

		while (left < right) {
			if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}