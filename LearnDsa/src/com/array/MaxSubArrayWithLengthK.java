package com.array;

public class MaxSubArrayWithLengthK {

	public static void main(String[] args) {
		int[] a = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
		System.out.println(solve(a, 5));
	}

	public static int solve(int[] a, int k) {
		int n = a.length;
		// create a start window with sum
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + a[i];
		}
//		System.out.println(sum+"====");
		int ans = sum;

		// shift remaining length k window
		int si = 1;
		int ei = k;
		while (ei < n) {
			sum = sum + a[ei] - a[si - 1];
//			System.out.println(sum +"---------");
			ans = Math.max(ans, sum);
			si++;
			ei++;
		}
		return ans;
	}
}
