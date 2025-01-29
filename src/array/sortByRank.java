package array;

import java.util.Comparator;

public class sortByRank implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Car c1 = (Car) o1;
		Car c2 = (Car) o2;

		if (c1.rank > c2.rank) {
			return 1;

		} else if (c1.rank < c2.rank) {
			return -1;
		} else {
			return 0;
		}
	}

}
