package com.bootcamp.pt1.difficult_programming_questions;

public class Q1_Difficult_Java_Programming_BinaryTree {

	// Q1: Write a program to implement binary search tree in Java.

	static class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	Q1_Difficult_Java_Programming_BinaryTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key + " ");
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		Q1_Difficult_Java_Programming_BinaryTree tree = new Q1_Difficult_Java_Programming_BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal:");
		tree.inorder();

	}
}