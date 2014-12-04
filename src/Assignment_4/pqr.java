package Assignment_4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class pqr {
	static class PQsort implements Comparator<A> {
		public int compare(A one, A two) {
			return two.getA2() - one.getA2();
		}
	}

	public static void main(String[] args) {
		PQsort pqs = new PQsort();
		PriorityQueue<A> pq = new PriorityQueue<A>(pqs);
		pq.add(new A("โกคู 1", 8, 4));
		pq.add(new A("พิคโคโร", 5, 4));

		Queue<A> customerPriorityQueue = pq;

		PQsort pqs1 = new PQsort();
		PriorityQueue<A> pq1 = new PriorityQueue<A>(pqs1);
		pq1.add(new A("ศัตรู 1", 5, 3));
		pq1.add(new A("ศัตรู 2", 8, 4));
		pq1.add(new A("ศัตรู 3", 1, 5));
		pq1.add(new A("ศัตรู 4", 3, 2));
		Queue<A> customerPriorityQueue1 = pq1;

		pollDataFromPriorityQueue(customerPriorityQueue, customerPriorityQueue1);
	}

	// utility method to poll data from queue
	private static void pollDataFromQueue(Queue<A> customerPriorityQueue) {
		while (true) {
			A cust = customerPriorityQueue.poll();
			if (cust == null)
				break;
			System.out.println("name : " + cust.getA1() + "\t: " + cust.getA2() + "\t"
					+ cust.getA3());
		}
	}

	// ================================================================================
	private static void pollDataFromPriorityQueue(Queue<A> queue1, Queue<A> queue2) {
		while (true) {
			A c1 = queue1.peek();
			A c2 = queue2.peek();

			if (c1 == null && c2 == null) {
				break;
			} else if (c1 == null && c2 != null) {
				System.out.println("- " + c2.getA1() + "\tvs " + "โกคู หรือ พิคโคโร");
				queue2.poll();
			} else if (c1.getA2() == c2.getA2() && c1.getA3() > c2.getA3()) {
				System.out.println("- " + c1.getA1() + "\tvs " + c2.getA1());
				queue1.poll();
			} else if (c2.getA2() > c1.getA2()) {
				System.out.println("- " + c2.getA1() + "\tvs " + c1.getA1());
				queue2.poll();
			} else if (c1.getA2() == c2.getA2() && c1.getA3() == c2.getA3()) {
				System.out.println("- " + c1.getA1() + "\tvs " + c2.getA1());
				queue1.poll();
			} else if (c1.getA2() > c2.getA2()) {
				System.out.println("- " + c1.getA1() + "\tvs " + c2.getA1());
				queue1.poll();
			} else if (c2.getA2() == c1.getA2() && c2.getA3() > c1.getA3()) {
				System.out.println("- " + c2.getA1() + "\tvs " + c1.getA1());
				queue2.poll();
			}
		}
	}
}
