package array;

import java.util.Arrays;
import java.util.Comparator;

public class sortByPrice implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Car c1 = (Car) o1;
		Car c2 = (Car) o2;

		if (c1.price > c2.price) {
			return 1;

		} else if (c1.price < c2.price) {
			return -1;
		} else {
			return 0;
		}
	}

}
