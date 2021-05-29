package leetcode;

import java.util.Arrays;

public class NonOverlappingIntervals_435 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		// int[][] intervals = {{1,2},{1,2},{1,2}};
		int[][] intervals = { { 1, 2 }, { -100, -2 } };
		//[[1,2],[2,3],[3,4],[-100,-2],[5,7]]
		System.out.println(eraseOverlapIntervals(intervals));

	}

	public static int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

		int maxInterval = intervals[0][1];
		int erasedIntervals = 0;
		for (int i = 1; i < intervals.length; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];

			if (start >= maxInterval) {
				maxInterval = end;
			} else {
				erasedIntervals++;
			}

		}

		return erasedIntervals;
	}

}
