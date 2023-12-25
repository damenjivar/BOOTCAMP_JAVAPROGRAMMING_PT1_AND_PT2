package com.bootcamp.pt1.difficult_programming_questions;

public class Q6_Difficult_Java_Programming_LongestCommonSubsequence {

	// Q6: Write a program to find the longest common subsequence of two strings in
	// Java.

	// Step1: Define a method to find the Longest Common Subsequence
	static String findLCS(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		// Step 2: Create a 2D array to store lengths of LCS
		int[][] dp = new int[m + 1][n + 1];

		// Step3: Build the dp array using bottom-up dynamic programming
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (str1.charAt(i - 1) == str2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}

		// Step4: Use the dp array to reconstruct the LCS
		int index = dp[m][n];
		char[] lcs = new char[index];

		int i = m, j = n;
		while (i > 0 && j > 0) {
			if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
				lcs[index - 1] = str1.charAt(i - 1);
				i--;
				j--;
				index--;
			} else if (dp[i - 1][j] > dp[i][j - 1])
				i--;
			else
				j--;
		}

		// Step5: Convert char array to String and return the LCS
		return new String(lcs);
	}

	// Step6: Main method to demonstrate the usage
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "ACDF";

		// Step7: Call the findLCS method and print the result
		String lcs = findLCS(str1, str2);
		System.out.println("Longest Common Subsequence: " + lcs);
	}
}