package com.bootcamp.pt1.easy_programming_questions;

public class Q9_Easy_Java_Programming {

	// Q9: Write a Java program to convert Fahrenheit to Celsius.

	public static void main(String[] args) {
		double fahrenheit = 98.6; // hardcoded Fahrenheit temperature

		double celsius = convertToFahrenheit(fahrenheit);

		System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
	}

	private static double convertToFahrenheit(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
