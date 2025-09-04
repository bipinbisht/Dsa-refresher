package com.basic;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] arr = { 1,2,3 };
		System.out.println("Is the array sorted? " + isSorted(arr));
	}

	public static boolean isSorted(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return true;
		}
		for (int i = 1; i<= arr.length - 1; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
