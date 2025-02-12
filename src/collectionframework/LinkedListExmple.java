package collectionframework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExmple {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<>();

		// Adding Element in LinkedList
		li.add("Akshay");
		li.add("Ram");
		li.add("Sham");
		System.out.println(li);

		// Access data on perticular index
		System.out.println(li.get(2));
		System.out.println(li.indexOf("Ram"));

		// access data using foreach loop
		for (String s : li) {
			System.out.println(s);
		}

		System.out.println("-----------------------------");
		// access Data using for loop
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("-----------------------------");

		// access data using ListIterator in forward direction
		ListIterator<String> iterator = li.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Add Data at Starting
		li.addFirst("newdata");
		System.out.println(li);

		// remove data at first
		li.removeFirst();
		System.out.println(li);

		li.poll();
		System.out.println(li);

		System.out.println(li.peek());

		// remove last index data
		li.removeLast();
		System.out.println(li);
	}

}
