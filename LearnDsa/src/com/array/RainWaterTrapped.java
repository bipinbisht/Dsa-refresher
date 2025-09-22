package com.array;

import java.util.Arrays;

public class RainWaterTrapped {

	public static void main(String[] args) {
//		int[] a = { 2, 3, 5, 3, 6, 7 };
		int[] a = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };

		System.out.println(solve(a));

	}

	public static int solve(int[] a) {
		int n = a.length;

		int[] lmax = new int[n];
		int[] rmax = new int[n];

		lmax[0] = a[0];
		rmax[n - 1] = a[n - 1];
		// creating lmax array
		for (int i = 1; i < n; i++) {
			lmax[i] = Math.max(lmax[i - 1], a[i]);
		}

		// creating rmax array
		for (int i = n - 2; i >= 0; i--) {
			rmax[i] = Math.max(rmax[i + 1], a[i]);
		}

		System.out.println(Arrays.toString(lmax));
		System.out.println(Arrays.toString(rmax));
		int water = 0;

		for (int i = 0; i < n; i++) {
			water += Math.min(lmax[i], rmax[i]) - a[i];
		}

		return water;

	}

}
