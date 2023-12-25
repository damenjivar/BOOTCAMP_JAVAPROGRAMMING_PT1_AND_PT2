package com.bootcamp.pt1.difficult_programming_questions;

import java.util.Arrays;

public class Q10_Difficult_Java_Programming {

	// Q10: Write a program to find the shortest path in a weighted graph using
	// Dijkstra's algorithm in Java.

	// Step1: define a method to find the shortest path using Dijkstra's algorithm
	static void dijkstra(int[][] graph, int source) {
		int vertices = graph.length;
		int[] distance = new int[vertices];
		boolean[] visited = new boolean[vertices];

		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[source] = 0;

		// Step2: process all vertices
		for (int count = 0; count < vertices - 1; count++) {
			int u = minDistance(distance, visited);
			visited[u] = true;

			// Step3: update distance values of adjacent vertices of the picked vertex
			for (int v = 0; v < vertices; v++) {
				if (!visited[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE
						&& distance[u] + graph[u][v] < distance[v]) {
					distance[v] = distance[u] + graph[u][v];
				}
			}
		}

		// Step4: print the shortest distances from the source to all vertices
		printSolution(distance);
	}

	// Step5: define a method to find the vertex with the minimum distance value
	static int minDistance(int[] distance, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;

		for (int v = 0; v < distance.length; v++) {
			if (!visited[v] && distance[v] <= min) {
				min = distance[v];
				minIndex = v;
			}
		}

		return minIndex;
	}

	// Step6: define a method to print the solution
	static void printSolution(int[] distance) {
		System.out.println("Vertex \t\t Distance from Source");
		for (int i = 0; i < distance.length; i++) {
			System.out.println(i + "\t\t\t " + distance[i]);
		}
	}

	// Step7: main method to demonstrate the usage
	public static void main(String[] args) {
		int[][] graph = { { 0, 2, 0, 4, 0 }, { 2, 0, 1, 3, 0 }, { 0, 1, 0, 7, 0 }, { 4, 3, 7, 0, 1 },
				{ 0, 0, 0, 1, 0 } };
		int source = 0;

		// Step8: call the dijkstra method and print the result
		dijkstra(graph, source);
	}
}
