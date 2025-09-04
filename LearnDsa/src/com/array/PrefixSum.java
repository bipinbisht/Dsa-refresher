package com.array;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		int[] a = {2,4,3,1};
		
		int[] pSum = pSum(a);
		
		System.out.println(Arrays.toString(pSum));

	}
	
	
	public static int[] pSum(int[] a)
	{
		int[] prefixSum = new int[a.length];
		
		prefixSum[0] = a[0];
		
		for(int i =1; i<prefixSum.length; i++)
		{
			prefixSum[i] = a[i] + prefixSum[i-1];
		}
		return prefixSum;
	}

}
