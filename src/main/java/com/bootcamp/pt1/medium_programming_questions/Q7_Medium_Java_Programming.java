package com.bootcamp.pt1.medium_programming_questions;

public class Q7_Medium_Java_Programming {

	// Q7: Write a Java program to implement selection sort algorithm.

	public static void main(String[] args) {
		// Sample array
		int[] arr = { 64, 25, 12, 22, 11 };

		// Perform selection sort
		selectionSort(arr);

		// Display the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}

	// Function to perform selection sort on an array
	private static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in the unsorted part of the array
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the found minimum element with the first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
