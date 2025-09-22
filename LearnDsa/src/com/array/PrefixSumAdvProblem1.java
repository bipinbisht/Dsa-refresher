package com.array;

import java.util.Arrays;

//initially all elements of arrl are 0 GivenQqueries

//Every query contains s e val
//Increment elements 
//from s to e by val
//Return the final state of arre

public class PrefixSumAdvProblem1 {

	public static void main(String[] args) {
		int n = 5;
		int[][] queries = { { 1, 3, 2 }, { 2, 4, 1 }, { 3, 4, -1 } };

		int[] solve = solve(n, queries);
		System.out.println(Arrays.toString(solve));

	}

	public static int[] solve(int n, int[][] queries) {
		int[] a = new int[n];

		// setting the values to each index
		for (int q = 0; q < queries.length; q++) {
			int si = queries[q][0];
			int ei = queries[q][1];
			int value = queries[q][2];

			a[si] += value;
			if (ei + 1 < n) {
				a[ei + 1] += -value;
			}

		}

		// Now take prefix sum of the array

		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1] + a[i];
		}
		return a;

	}

}
