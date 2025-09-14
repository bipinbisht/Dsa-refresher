package com.String;

public class LongestPalindormicCount {

	public static void main(String[] args) {

		String s = "adaebcdfdcbetggte";
		System.out.println(solve(s));
	}

	public static int solve(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int oddLength = expand(s, i - 1, i + 1);
			int evenLength = expand(s, i, i + 1);

			ans = Math.max(ans, Math.max(oddLength, evenLength));
		}
		return ans;
	}

//magic function
	public static int expand(String s, int l, int r) {
		while (l >= 0 && r < s.length()) {
			if (s.charAt(l) == s.charAt(r)) {
				l--;
				r++;
			} else
				break;
		}
		// both excluded
		return r - l - 1;
	}

}
