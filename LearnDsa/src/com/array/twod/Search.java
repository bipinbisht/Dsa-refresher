package com.array.twod;

//search in rowise and columnwise sorted 2d array
public class Search {

	public static void main(String[] args) {
//		int[][] a = { { -5, -2, 1, 13 }, { -4, 0, 3, 14 }, { -3, 2, 6, 18 }, { 2, 5, 10, 20 } };
		int[][] a = { { 1, 3, 6 }, { 2, 7, 8 }, { 5, 9, 12 } };
		System.out.println(solve(a, 9));
	}

	public static int solve(int[][] a, int target) {
		int rowLength = a.length;
		int colLength = a[0].length;

		int i = 0;
		int j = colLength - 1;

		while (i < rowLength && j >= 0) {
			if (a[i][j] == target)
				return 1;
			else if (a[i][j] < target)
				i++;
			else
				j--;
		}
		return -1;
	}

}
