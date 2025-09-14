package com.array;

public class SubArraySum {

	public static void main(String[] args) {

		int[] a = { 3, -2, 1, 4 };
		System.out.println(sum(a));
	}

	public static long sum(int[] a) {
		int n = a.length;

		int ans = 0;
		for (int i = 0; i < n; i++) {
			// formula for contribution technique
			ans += a[i] * (i + 1) * (n - i);
		}

		return ans;
	}

}
