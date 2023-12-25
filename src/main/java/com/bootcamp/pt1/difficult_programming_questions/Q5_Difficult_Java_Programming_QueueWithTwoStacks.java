package com.bootcamp.pt1.difficult_programming_questions;

import java.util.Stack;

public class Q5_Difficult_Java_Programming_QueueWithTwoStacks {

	// Q5: Write a program to implement a queue using two stacks in Java.

	private Stack<Integer> stack1; // first stack for enqueue operation
	private Stack<Integer> stack2; // second stack for dequeue operation

	public Q5_Difficult_Java_Programming_QueueWithTwoStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	// Step 1: Enqueue operation
	public void enqueue(int item) {
		stack1.push(item);
	}

	// Step 2: Dequeue operation
	public int dequeue() {
		// Step 3: If both stacks are empty, the queue is empty
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1; // Assuming -1 represents an empty queue or an error condition
		}

		// Step 4: If stack2 is empty, transfer elements from stack1 to stack2
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		// Step 5: Pop from stack2 for dequeue operation
		return stack2.pop();
	}

	public static void Main(String[] args) {
		Q5_Difficult_Java_Programming_QueueWithTwoStacks queue = new Q5_Difficult_Java_Programming_QueueWithTwoStacks();

		// Step 6: Enqueue elements
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		// Step 7: Dequeue elements
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println("Dequeued element: " + queue.dequeue());
	}
}