package com.array;

public class PrintSubArrayOfLengthK {

	public static void main(String[] args) {
		int[] a = {17,3,4,9,12,6};
		
		print(a, 3);
	}

	public static void print(int[] a, int k) {
		int n = a.length;

		int si = 0;
		int ei = k - 1;

		while (ei < n) {
			System.out.println("si=> " + si + " " + " ei=>" + ei);
			si++;
			ei++;
		}

	}

}
