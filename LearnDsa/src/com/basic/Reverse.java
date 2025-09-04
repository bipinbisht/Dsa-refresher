package com.basic;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(reverse(a, 0, a.length - 1)));

	}

	public static int[] reverse(int[] a, int lb, int ub) {
		while (lb <= ub) {
			int temp = a[lb];
			a[lb] = a[ub];
			a[ub] = temp;
			lb++;
			ub--;
		}
		return a;
	}

}
