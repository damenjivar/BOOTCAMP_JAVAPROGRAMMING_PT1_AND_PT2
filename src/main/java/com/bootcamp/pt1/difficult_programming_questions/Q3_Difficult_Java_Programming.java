package com.bootcamp.pt1.difficult_programming_questions;

public class Q3_Difficult_Java_Programming {

	// Q3: Write a program to sort an array of objects in Java using the quicksort
	// algorithm.

	static class Person {
		int age;

		Person(int age) {
			this.age = age;
		}
	}

	static void swap(Person[] arr, int i, int j) {
		Person temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(Person[] arr, int low, int high) {
		int pivot = arr[high].age;
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j].age < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	static void quickSort(Person[] arr, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);

			quickSort(arr, low, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
		}
	}

	static void printArray(Person[] arr) {
		for (Person person : arr) {
			System.out.println(person.age + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Person[] people = { new Person(25), new Person(18), new Person(30), new Person(22), new Person(35) };

		System.out.println("Original Array:");
		printArray(people);

		quickSort(people, 0, people.length - 1);

		System.out.println("Sorted Array:");
		printArray(people);
	}
}