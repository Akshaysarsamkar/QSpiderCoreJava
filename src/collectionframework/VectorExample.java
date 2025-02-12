package collectionframework;

import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Double> v = new Vector<Double>();

		// Add Element
		v.add(12.45);
		v.add(78.45);
		v.add(89.10);
		v.add(78.321);

		System.out.println(v);

		// Access element
		System.out.println("Element of index 1:=" + v.get(1));
		System.out.println("Element of index 2:=" + v.get(2));

		// iterate vector Element
		for (double data : v) {
			System.out.println(data);
		}

		System.out.println("====================================");
		ListIterator<Double> listIterator = v.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// remove Element
		v.remove(0);
		System.out.println(v);

		v.remove(78.45);
		System.out.println(v);

		Vector<Double> vector = new Vector<Double>();
		vector.addAll(v);

		System.out.println(vector);

		// Access first element
		System.out.println(v.firstElement());

		// Access Last element
		System.out.println(v.lastElement());

		// remove all element
		System.out.println(v.removeAll(v));
		System.out.println(v);
	}

}
