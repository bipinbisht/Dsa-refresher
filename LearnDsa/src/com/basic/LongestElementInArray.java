package com.basic;

public class LongestElementInArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("The largest element in the array is: " + largestElement(nums));
	}

	// Function to find the longest element in an array
	public static int largestElement(int[] nums) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
		}
		return max;
	}

}
