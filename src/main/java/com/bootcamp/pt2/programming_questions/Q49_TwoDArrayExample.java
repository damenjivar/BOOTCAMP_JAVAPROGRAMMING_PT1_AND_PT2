package com.bootcamp.pt2.programming_questions;

public class Q49_TwoDArrayExample {

	public static void main(String[] args) {
		// Step1: declare and initialize a 2D array
		int[][] a = { { 5, 2, 9 }, { 4, 6, 8 } };

		// Step2: use nested for loops to iterate over each row and column
		System.out.println("Elements in the 2D array:");

		for (int i = 0; i < a.length; i++) {
			// Step3: iterate over columns for each row
			for (int j = 0; j < a[i].length; j++) {
				// Step4: print the current element
				System.out.println(a[i][j] + " ");
			}

			// Step5: move to the next line after printing all elements in a row
			System.out.println();
		}
	}
}