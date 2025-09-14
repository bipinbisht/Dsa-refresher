package com.array;

public class ProblemZero2 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 1, 1, 0, 1, 1, 0 };
		System.out.println(solve(a));
	}

	public static int solve(int[] a) {
		int n = a.length;

		int countOne = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1)
				countOne++;
		}

		if (countOne == 0)
			return 0;
		if (countOne == n)
			return n;

		for (int i = 0; i < n; i++) {
			int l = 0;
			int r = 0;
			// count of 1 on left side
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] == 1)
					l++;
				else
					break;
			}
			// count 1 on right side
			for (int j = i + 1; j < n; j++) {
				if (a[j] == 1)
					r++;
				else
					break;
			}
			//special condtion for this  we cannot blindly add 1 we neeed to check count of 1s
			int check = l + r;
			if (check < countOne) {
				ans = Math.max(ans, check + 1);
			} else
				ans = Math.max(ans, r + l);
		}
		return ans;
	}

}
