package Assignment_4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pqr {
	static class PQsort implements Comparator<Integer> {
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}

	public static void main(String[] args) {

		int[] ia = { 1, 11, 5, 3, 4, 7, 6, 9, 8 };
		PQsort pqs = new PQsort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(pqs);
		for (int x : ia) {
			pq2.offer(x);
		}
		// System.out.println("pq2: " + pq2);
		// System.out.println("peek: " + pq2.peek());
		// System.out.println("poll: " + pq2.poll());
		// System.out.println("size: " + pq2.size());
		// System.out.println("pq2: " + pq2);

		for (int i = 0; i < ia.length; i++) {
			System.out.println("pq2: " + pq2);
			System.out.println("peek: " + pq2.peek());
			System.out.println("poll: " + pq2.poll());
			System.out.println("size: " + pq2.size());
			System.out.println("pq2: " + pq2);
			System.out.println("====================");
		}

	}
}
