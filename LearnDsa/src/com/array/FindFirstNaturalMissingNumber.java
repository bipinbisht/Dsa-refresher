package com.array;

public class FindFirstNaturalMissingNumber {

	public static void main(String[] args) {

//		int[] a = { 1, 2, 5, 6, 3, 4 };
		int[] a = { 1,2,3,4,5};
		System.out.println(solve(a));
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

}
