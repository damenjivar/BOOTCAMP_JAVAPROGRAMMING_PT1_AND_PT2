package com.bootcamp.pt1.difficult_programming_questions;

public class Q8_Difficult_Java_Programming {

	// Q8: Write a program to implement a merge sort algorithm in Java.

	// Step1: define a method to perform Merge Sort
	static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			// Step2: recursively sort the first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Step3: Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	// Step4: define a method to merge two sorted subarrays
	static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Step5: Create temporary arrays to hold the two halves
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Step6: copy data to temporary arrays leftArray[] and rightArray[]
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		// Step7: merge the temporary arrays back into arr[left...right]
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Step8: copy the remaining elements of leftArray[], if there are any
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// Step9: copy the remaining elements of rightArray[], if there are any
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Step10: main method to demonstrate the usage
	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Original Array:");
		printArray(array);

		// Step11: call the mergeSort method and print the sorted array
		mergeSort(array, 0, array.length - 1);

		System.out.println("Sorted Array:");
		printArray(array);
	}

	// Step12: utility method to print an array
	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.println(value + " ");
		}
		System.out.println();
	}
}