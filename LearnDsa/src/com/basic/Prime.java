package com.basic;

public class Prime {

	public static void main(String[] args) {
		System.out.println(isPrime(11));
	}

	public static Boolean isPrime(int n) {
		return countFactors(n) == 2;
	}

	public static int countFactors(int n) {
		int c = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (i == n / i)
					c++;
				else
					c = c + 2;
			}
		}
		return c;
	}

}
