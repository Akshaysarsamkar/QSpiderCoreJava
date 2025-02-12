package collectionframework;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();

		set.add(45);
		set.add(98);
		set.add(32);
		set.add(45);

		set.addAll(set);
		System.out.println(set);

	}

}
