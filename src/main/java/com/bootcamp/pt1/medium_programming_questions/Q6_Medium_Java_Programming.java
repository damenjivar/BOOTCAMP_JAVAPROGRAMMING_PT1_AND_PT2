package com.bootcamp.pt1.medium_programming_questions;

public class Q6_Medium_Java_Programming {

	// Q6: Write a Java program to implement bubble sort algorithm.

	public static void main(String[] args) {
		// Sample array
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		// Perform bubble sort
		bubbleSort(arr);
		// Display the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}

	// Function to perform bubble sort on an array
	private static void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Swap if the element found is greater than the next element
				if (arr[j] > arr[j + 1]) {
					// Swapp arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
