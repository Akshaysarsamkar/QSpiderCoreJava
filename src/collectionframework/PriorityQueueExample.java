package collectionframework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(7);
		queue.add(1);
		queue.add(5);
		queue.add(8);
		queue.add(6);
		System.out.println(queue);

		// get element
		System.out.println(queue.element());

		// get peek element
		System.out.println(queue.peek());

		// iterate element
		for (int data : queue) {
			System.out.println(data);
		}

		System.out.println("=============================");

		Iterator<Integer> iterator = queue.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		// remove element
		queue.poll();
		System.out.println(queue);

		queue.remove();
		System.out.println(queue);

		// remove all
		queue.removeAll(queue);
		System.out.println(queue);
	}

}
