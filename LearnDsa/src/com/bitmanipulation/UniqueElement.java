package com.bitmanipulation;

public class UniqueElement {

	public static void main(String[] args) {
//		int[] a = { 1,1, 2, 2, 3, 3, 4, 4,5 };
		int[] a = { 2, 2, 9 };
		System.out.println(solve(a));
		System.out.println(8>>1);
	}

	public static int solve(int[] a) {
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans ^= a[i];
		}
		return ans;
	}

}
