package com.array;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Interval> solve(ArrayList<Interval> interval) {
		int l = interval.get(0).getSt();
		int r = interval.get(0).getEt();
		ArrayList<Interval> ans = new ArrayList<Interval>();
		// overlapping
		for (int i = 1; i < interval.size(); i++) {
			if (interval.get(i).getSt() <= r) {
				r = Math.max(r, interval.get(i).et);
			} else {
				ans.add(new Interval(l, r));
				l = interval.get(i).st;
				r = interval.get(i).et;
			}
		}
		ans.add(new Interval(l, r));
		return ans;
	}

	static class Interval {
		int st;
		int et;

		public int getSt() {
			return st;
		}

		public void setSt(int st) {
			this.st = st;
		}

		public int getEt() {
			return et;
		}

		public void setEt(int et) {
			this.et = et;
		}

		public Interval(int st, int et) {
			super();
			this.st = st;
			this.et = et;
		}

	}

}
