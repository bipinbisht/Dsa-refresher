package com.array;

import java.util.Arrays;

// we are doing for distinct aswell as dublicate method
public class NobleInteger {

	public static void main(String[] args) {
		int[] a = { -10, 1, 3, 100, 1 };
		System.out.println(solveDublicate(a));
	}

	public static int solveDistinct(int[] a) {
		Arrays.sort(a);
		int n = a.length;

		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == i)
				ans++;
		}
		return ans;

	}

	public static int solveDublicate(int[] a) {
		Arrays.sort(a);
		int n = a.length;
		int smallerCount = 0;
		int ans = 0;
		if (a[0] == 0) {
			ans++;
		}

		for (int i = 1; i < n; i++) {
			if (a[i] != a[i - 1])
				smallerCount = i;
			if (a[i] == smallerCount)
				ans++;
		}
		return ans;

	}

}
