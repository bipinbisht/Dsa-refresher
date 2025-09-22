package com.bitmanipulation;

public class Odd {

	public static void main(String[] args) {
		
		System.out.println(isOdd(100));

	}

	public static boolean isOdd(int n) {
		if ((n & 1) == 0)
			return true;
		return false;
	}

}
