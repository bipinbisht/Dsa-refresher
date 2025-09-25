package com.array;

public class FindFirstNaturalMissingNumber {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 6, 3, 4 };
		int[] a1 = { 9, 2, 6, 4, -8, 1, 3 };
//		int[] a = { 1, 2, 3, 4, 5 };
//		System.out.println(solve(a1));
		System.out.println(optimizeSolution(a));
	}

	// brute force
	public static int solve(int[] a) {
		int n = a.length;

		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			for (int j = 0; j < n; j++) {

				if (a[j] == i) {
					flag = true;
					break;
				}

			}
			if (flag == false)
				return i;
		}
		return n + 1;
	}

	// optimized approach

	public static int optimizeSolution(int[] a) {
		int n = a.length;

		for (int i = 0; i < n; i++) {
			// push element to its correct position
			while (a[i] != i + 1 && a[i] > 0 && a[i] <= n) {
				int val = a[i];
				int t = a[val - 1];
				a[val - 1] = a[i];
				a[i] = t;

			}

		}
		for (int i = 0; i < n; i++) {
			if (a[i] != i + 1)
				return i + 1;
		}

		return n + 1;
	}

}
