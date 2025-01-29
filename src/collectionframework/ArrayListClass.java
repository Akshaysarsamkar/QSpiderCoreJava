package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		// add the element in ArrayList
		al.add(45);
		al.add(78);
		al.add(12);
		al.add(75);
		System.out.println(al);

		// iterating Element in Forward Direction
		ListIterator<Integer> li = al.listIterator();
		System.out.println("Iterate ArrayList In forward Direction");
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("Iterate ArrayList In Backword Direction");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		// Access the element in ArrayList
		System.out.println("Access the Element at index 3:=" + al.get(3));

		// Update Element Value
		al.set(0, 100);
		System.out.println(al);

		// Remove Element
		al.remove(1);
		System.out.println(al);

		// Copy ArrayList Into Other
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.addAll(al);
		System.out.println(al1);

		// remove all element
		al.clear();
		System.out.println(al);

		// search Element
		System.out.println(al.contains(45));

		// Sort ArrayList
		Collections.sort(al1);
		System.out.println(al1);
	}

}
