package buildininterface;

import java.util.Arrays;
import java.util.Comparator;

class Mobile {
	int mobileId;
	int price;
	int rom;
	int ram;
	String name;

	public Mobile(int mobileId, int price, int rom, int ram, String name) {
		super();
		this.mobileId = mobileId;
		this.price = price;
		this.rom = rom;
		this.ram = ram;
		this.name = name;
	}

}

class SortByRom implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1 = (Mobile) o1;
		Mobile m2 = (Mobile) o2;

		if (m1.rom > m2.rom) {
			return 1;
		} else if (m1.rom < m2.rom) {
			return -1;
		} else {
			return 0;
		}
	}

}

class SortByPrice implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1 = (Mobile) o1;
		Mobile m2 = (Mobile) o2;

		if (m1.price > m2.price) {
			return 1;
		} else if (m1.price < m2.price) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class CompareMethodExample {

	public static void main(String[] args) {

		Mobile m[] = new Mobile[5];

		m[0] = new Mobile(1, 25000, 16, 128, "POCO M5 Pro");
		m[2] = new Mobile(8, 12000, 4, 64, "MI 16 Pro");
		m[1] = new Mobile(23, 15500, 8, 256, "VIVO T2X");
		m[4] = new Mobile(14, 22999, 4, 256, "Samsung v12");
		m[3] = new Mobile(65, 12999, 8, 64, "OPPO S12");

		Arrays.sort(m, new SortByRom());

		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i].price + " ");
			System.out.println(m[i].name);
		}
	}

}
