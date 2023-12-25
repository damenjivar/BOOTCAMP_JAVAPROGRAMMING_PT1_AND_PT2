package com.bootcamp.pt1.difficult_programming_questions;

public class Q2_Difficult_Java_Programming_DoublyLinkedList {

	// Q2: Write a program to implement a doubly-linked list in Java.

	static class Node {
		int data;
		Node prev, next;

		Node(int data) {
			this.data = data;
			this.prev = this.next = null;
		}
	}

	Node head;

	void insertAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		if (head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}

	void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q2_Difficult_Java_Programming_DoublyLinkedList list = new Q2_Difficult_Java_Programming_DoublyLinkedList();
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);

		System.out.println("Doubly Linked List");
		list.display();
	}
}