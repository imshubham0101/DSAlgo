package may_challange;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

public class CourseSchedule_3 {

	class Pair {
		int duration;
		int lastDay;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[][] courses = {{100,200},{200,1300},{1000,1250},{2000,3200}};
		// int[][] courses = {{3,2},{4,3}};
		// [[5,15],[3,19],[6,7],[2,10],[5,16],[8,14],[10,11],[2,19]]
		int[][] courses = { { 5, 15 }, { 3, 19 }, { 6, 7 }, { 2, 10 }, { 5, 16 }, { 8, 14 }, { 10, 11 }, { 2, 19 } };
		System.out.println(scheduleCourse(courses));

	}

	public static int scheduleCourse(int[][] courses) {

		Arrays.sort(courses, (a, b) -> a[1] - b[1]);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);

		int total = 0;
		for (int[] c : courses) {
			int dur = c[0];
			int end = c[1];

			if (total + dur <= end) {
				total += dur;
				pq.add(dur);
			} else if (pq.size() > 0 && pq.peek() > dur) {
				total += dur - pq.poll();
				pq.add(dur);
			}

		}
		return pq.size();
	}

}
