package com.bootcamp.pt1.difficult_programming_questions;

public class Q9_Difficult_Java_Programming {

	// Q9: Write a program to implement a binary search algorithm for a rotated
	// sorted array in Java.

	// Step1: Define a method to perform a binary search on a rotated sorted array
	static int search(int[] nums, int target) {
		int pivot = findPivot(nums);

		// Step2: if no pivot is found, array is not rotated, perform regular binary
		if (pivot == -1)
			return binarySearch(nums, 0, nums.length - 1, target);

		// Step3: if pivot is found, decide which subarray to search
		if (nums[pivot] == target)
			return pivot;
		if (nums[0] <= target)
			return binarySearch(nums, 0, pivot - 1, target);
		return binarySearch(nums, pivot + 1, nums.length - 1, target);
	}

	// Step4: define a method to find the pivot point in the rotated sorted array
	static int findPivot(int[] nums) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (mid < high && nums[mid] > nums[mid + 1])
				return mid;
			if (mid > low && nums[mid] < nums[mid - 1])
				return mid;

			if (nums[low] >= nums[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}

		return -1; // If no pivot is found
	}

	// Step5: define a method to perform binary search on a sorted array
	static int binarySearch(int[] nums, int low, int high, int target) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target)
				return mid;
			if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1; // If target is not found
	}

	// Step6: main method to demonstrate the usage
	public static void main(String[] args) {
		int[] rotatedArray = { 4, 5, 6, 7, 8, 1, 2, 3 };
		int target = 6;

		// Step7: call the search method and print the result
		int result = search(rotatedArray, target);
		if (result != -1) {
			System.out.println("Target " + target + " found at index " + result);
		} else {
			System.out.println("Target " + target + " not found in the array");
		}
	}
}