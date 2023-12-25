package com.bootcamp.pt1.easy_programming_questions;

public class Q8_Easy_Java_Programming {

	// Q8: Write a Java program to implement a simple calculator.

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		char operator = '+';

		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Error: Division by zero.");
				return; // exit the program
			}
			break;
		default:
			System.out.println("Error: Invalid operator");
			return; // exit the program
		}

		System.out.println("result: " + result);
	}
}