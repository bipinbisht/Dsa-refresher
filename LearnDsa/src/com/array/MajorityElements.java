package com.array;

public class MajorityElements {

	public static void main(String[] args) {

		int[] a = { 3, 4, 3, 2, 4, 4, 4 };
		int[] a1 = { 3, 0, 0, 3, 3, 3, 0 };
		int[] a2 = { 3,1,1,1,1,1,1,1,1, 0, 0, 3, 3};
		System.out.println(solve(a2));
	}

	public static int solve(int[] a) {
		int n = a.length;

		int majority = a[0];
		int freq = 1;

		for (int i = 1; i < n; i++) {

			if (a[i] == majority)
				freq++;
			else if (freq == 0)
				majority = a[i];
			else
				freq--;
		}
		return majority;
	}

}
