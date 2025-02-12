package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> name = new HashSet<>();

		// add elements
		name.add("sam");
		name.add("ram");
		name.add("jon");
		name.add("dinga");
		System.out.println(name);

		// iterate element
		for (String s : name) {
			System.out.println(s);
		}

		Iterator<String> iterator = name.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// remove element
		name.remove("jon");
		System.out.println(name);

		// remove all
		name.removeAll(name);
		System.out.println(name);

	}

}
