package com.bootcamp.pt2.programming_questions;

public class Q50_MixedArrayExample {

	// Q50: Assign different values say integer, character, string etc into a single
	// array?

	public static void main(String[] args) {
		// Step1: declare an array with an Object type to store different data types
		Object[] myArray = new Object[5];

		// Step2: assign an integer value (42) to the array
		myArray[0] = 42;

		// Step3: assign a character ('A') to the array
		myArray[1] = 'A';

		// Step4: assign a string ("Hello") to the array
		myArray[2] = "Hello";

		// Step5: print the values in the array
		System.out.println("Values in the array:");

		for (Object element : myArray) {
			System.out.println(element);
		}
	}
}
