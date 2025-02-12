package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();

		// add element
		hashSet.add(45);
		hashSet.add(78);
		hashSet.add(12);
		hashSet.add(32);
		System.out.println(hashSet);

		// iterate
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// remove
		hashSet.remove(45);
		System.out.println(hashSet);

	}

}
