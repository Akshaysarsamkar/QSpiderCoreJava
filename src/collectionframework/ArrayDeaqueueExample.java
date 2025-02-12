package collectionframework;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeaqueueExample {

	public static void main(String[] args) {

		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

		deque.add(45);
		deque.add(12);
		deque.add(32);
		deque.add(98);
		System.out.println(deque);

		// Access first element
		System.out.println(deque.getFirst());

		// accees last element
		System.out.println(deque.getLast());

		// acceess peek frist
		System.out.println(deque.peekFirst());

		// peek last
		System.out.println(deque.peekLast());

		// iterate element
		Iterator<Integer> iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// remove element
		deque.pop();

		System.out.println(deque);

		deque.remove();
		System.out.println(deque);

	}

}
