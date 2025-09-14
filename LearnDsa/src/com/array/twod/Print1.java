package com.array.twod;

// Print element in 2d array from right to left  digonally
public class Print1 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		print(a);
	}

	public static void print(int[][] a) {
		int rowLength = a.length;
		int colLength = a[0].length;
		// printing first column starting point
		for (int col = 0; col < colLength; col++) {
			int i = 0;
			int j = col;
			while (i < rowLength && j >= 0) {
				System.out.print(a[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}

		// printing last column excluding last first row starting point
		for (int row = 1; row < rowLength; row++) {
			int i = row;
			int j = colLength - 1;
			while (i < rowLength && j >= 0) {
				System.out.print(a[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}

	}

}
