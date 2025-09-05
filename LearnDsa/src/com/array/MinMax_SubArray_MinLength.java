package com.array;

public class MinMax_SubArray_MinLength {

	public static void main(String[] args) {
		int[] a = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
		System.out.println(solve(a));
	}

	public static int solve(int[] a) {
		int n = a.length;

		if (n == 1)
			return n;

		// calculate min and max in array
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min + "=" + max);

		// now calculate subarray with min and max value with least size using carry fwd
		// technique
		if (max == min)
			return 1;
		int imin = -1;
		int imax = -1;
		int ans = n;
		for (int i = 0; i < n; i++) {
			if (a[i] == min) {
				imin = i;
				if (imax != -1)
					ans = Math.min(ans, imin - imax + 1);
			} else if (a[i] == max) {
				imax = i;
				if (imin != -1)
					ans = Math.min(ans, imax - imin + 1);
			}
		}

		return ans;
	}

}
