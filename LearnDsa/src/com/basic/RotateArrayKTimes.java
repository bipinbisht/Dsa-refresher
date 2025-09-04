package com.basic;

import java.util.Arrays;

public class RotateArrayKTimes {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(rotateArray(a, 12)));

	}

	public static int[] rotateArray(int[] a, int k) {
		int n = a.length;
		if (n == 1 || n == k)
			return a;

		k = k % n;

		// 1st reverse
		Reverse.reverse(a, 0, n-1);
		// reverse first k elements
		Reverse.reverse(a, 0, k - 1);
		// reverse remaining elements
		Reverse.reverse(a, k, n - 1);

		return a;
	}

}
