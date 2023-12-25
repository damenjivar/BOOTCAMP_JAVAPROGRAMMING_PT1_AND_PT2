package com.bootcamp.pt1.medium_programming_questions;

public class Q8_Medium_Java_Programming {

	// Q8: Write a Java program to implement insertion sort algorithm.

	public static void main(String[] args) {
		// Sample array
		int[] arr = { 64, 25, 12, 22, 11 };

		// Perform insertion sort
		insertionSort(arr);

		// Display the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.println(num + " ");
		}

	}

	// Function to perform insertion sort on an array
	private static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			// Move elements of arr[0..i-1] that are greater than key to one position ahead
			// of their current position.
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
