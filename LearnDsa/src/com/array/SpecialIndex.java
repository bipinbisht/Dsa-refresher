package com.array;

import java.util.Arrays;

public class SpecialIndex {

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 7, 6, -2 };
		System.out.println(countSpecialIndex(a));

	}

	public static int countSpecialIndex(int[] a) {
		int n = a.length;
		// get psum for odd and even
		int[] pEven = new int[n];
		int[] pOdd = new int[n];

		// even Prefix sum
		pEven[0] = a[0];
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				pEven[i] = a[i] + pEven[i - 1];
			} else
				pEven[i] = pEven[i - 1];
		}
		System.out.println(Arrays.toString(pEven));

		// odd Prefix sum
		pOdd[0] = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				pOdd[i] = a[i] + pOdd[i - 1];
			} else
				pOdd[i] = pOdd[i - 1];
		}
		System.out.println(Arrays.toString(pOdd));
		// main logic to calculate exclude index then we can check sum off odd = sum of
		// even

		int count = 0;
		// handling edge case for i=0;
		if (pOdd[n - 1] - pOdd[0] == pEven[n - 1] - pEven[0]) {
			System.out.println("idx=>" + 0);
			count++;
		}
		for (int i = 1; i < n; i++) {
			int se = pEven[i - 1] + pOdd[n - 1] - pOdd[i];
			int so = pOdd[i - 1] + pEven[n - 1] - pEven[i];
			if (se == so) {
				System.out.println("idx=>" + i);
				count++;
			}
		}
		return count;

	}

}
