package com.bootcamp.pt1.medium_programming_questions;

public class Q9_Medium_Java_Programming {

	// Q9: Write a Java program to implement binary search algorithm.

	public static void main(String[] args) {
		// Sample sorted array
		int arr[] = { 11, 22, 25, 34, 64, 90 };

		// Element to search for
		int target = 25;

		// Perform binary search
		int result = binarySearch(arr, target);

		// Display the result
		if (result == -1) {
			System.out.println("Element " + target + " not found in the array.");
		} else {
			System.out.println("Element " + target + " found at index " + result);
		}
	}

	// Function to perform binary search on a sorted array
	private static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid;
			}

			// If target is greater, ignore the left half
			if (arr[mid] < target) {
				low = mid + 1;
			} else { // If target is smaller, ignore the right half
				high = mid - 1;
			}
		}

		// If we reach here, then the element was not present
		return -1;
	}
}
