package com.array;

//Given a binary arres We can almost replace a single 0
//with f find the maximum consecutive I's we can get
//in the art after the replacement

public class ProblemZero1 {

	public static void main(String[] args) {

		int[] a = { 0, 1, 1, 1, 0, 1, 1, 0 };
		int[] a1 = { 1, 1, 1, 1, 1 };

		System.out.println(solve(a));

	}

	public static int solve(int[] a) {
		int n = a.length;

		int countZero = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				countZero++;
		}

		if (countZero == 0)
			return n;
		if (countZero == n)
			return 1;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				int l = 0;
				int r = 0;
				// count of 1 on left side
				for (int j = i - 1; j >= 0; j--) {
					if (a[j] == 1)
						l++;
					else
						break;
				}
				// count 1 on right side
				for (int j = i + 1; j < n; j++) {
					if (a[j] == 1)
						r++;
					else
						break;
				}

				ans = Math.max(ans, r + l + 1);
			}
		}
		return ans;
	}

}
