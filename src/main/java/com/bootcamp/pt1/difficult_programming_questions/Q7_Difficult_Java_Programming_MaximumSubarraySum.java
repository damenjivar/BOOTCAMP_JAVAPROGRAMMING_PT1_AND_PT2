package com.bootcamp.pt1.difficult_programming_questions;

public class Q7_Difficult_Java_Programming_MaximumSubarraySum {

	// Q7: Write a program to find the maximum subarray sum in an array of integers
	// in Java.

	// Step1: Define a method to find the maximum subarray sum
	static int findMaxSubarraySum(int[] arr) {
		int n = arr.length;
		int maxEndingHere = arr[0];
		int maxSoFar = arr[0];

		// Step2: Iterate through the array to find the maximum subarray sum
		for (int i = 1; i < n; i++) {
			maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}

		// Step3: Return the maximum subarray sum
		return maxSoFar;
	}

	// Step4: Main method to demonstrate the usage
	public static void main(String[] args) {
		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };

		// Step5: Call the findMaxSubarraySum method and print the result
		int maxSubarraySum = findMaxSubarraySum(array);
		System.out.println("Maximum Subarrray Sum: " + maxSubarraySum);
	}
}