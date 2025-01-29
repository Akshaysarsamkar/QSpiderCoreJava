package array;

import java.util.Arrays;

public class CarDriver {

	public static void main(String[] args) {

		Car c[] = new Car[4];

		c[0] = new Car(3, 850000f, "BMW", 1);
		c[1] = new Car(1, 9578000f, "ODDI", 6);
		c[2] = new Car(4, 210000, "Maruti", 12);
		c[3] = new Car(2, 150000f, "Tvs", 25);

		System.out.println("============= Sort By Rank ======================");
		Arrays.sort(c, new sortByRank());
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].rank);
		}

		System.out.println("============= Sort By Price =======================");
		Arrays.sort(c, new sortByPrice());
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].price);
		}
	}

}
