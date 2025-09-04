package com.basic;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 5, 5 };
		System.out.println("The second largest element in the array is: " + secondLargest(a));
	}

	public static int secondLargest(int[] a) {
		int max = a[0];
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				secondMax = max;
				max = a[i];

			} else if (a[i] != max && a[i] > secondMax) {
				secondMax = a[i];
			}

		}
		return secondMax;
	}

}
