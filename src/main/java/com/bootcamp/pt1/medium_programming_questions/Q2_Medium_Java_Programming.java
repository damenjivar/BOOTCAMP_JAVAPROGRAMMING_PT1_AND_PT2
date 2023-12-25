package com.bootcamp.pt1.medium_programming_questions;

public class Q2_Medium_Java_Programming {

	// Q2: Write a Java program to check if a given number is a palindrome or not.

	public static void main(String[] args) {
		int number = 121; // replace 121 with any number you want to check

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

	private static boolean isPalindrome(int num) {
		int originalNum = num;
		int reversedNum = 0;

		while (num > 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}

		// if the original number is equal to its reverse, it's a palindrome
		return originalNum == reversedNum;
	}
}
