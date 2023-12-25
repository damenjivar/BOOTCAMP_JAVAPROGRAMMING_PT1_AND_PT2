package com.bootcamp.pt1.difficult_programming_questions;

public class Q4_Difficult_Java_Programming_LinkedLinkStack {

	// Q4: Write a program to implement a stack using a linked list in Java.

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node top;

	Q4_Difficult_Java_Programming_LinkedLinkStack() {
		this.top = null;
	}

	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // Assuming -1 represents an empty stack of an error condition.
		}

		int popped = top.data;
		top = top.next;
		return popped;
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // Assuming -1 represents an empty stack or an error condition
		}
		return top.data;
	}

	boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		Q4_Difficult_Java_Programming_LinkedLinkStack stack = new Q4_Difficult_Java_Programming_LinkedLinkStack();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element: " + stack.peek());

		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());

		System.out.println("Is the stack empty? " + stack.isEmpty());
	}
}