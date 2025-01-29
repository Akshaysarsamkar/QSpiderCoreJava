package preprogramingM1;

import java.util.Scanner;

public class XylemOrPhloem {

	public static void main(String[] args) {

		int a[] = { 45, 32, 98, 65 };

		for (int i = 0; i < a.length; i++) {
			int is = 0;
			int last = a[i] % 10;
			a[i] = a[i] / 10;

//			System.out.println(last);
//			System.out.println(a[i]);

			while (a[i] > 9) {
				int rem = a[i] % 10;
				System.out.println(rem);
				is = is + rem;
				a[i] = a[i] / 10;
			}

			int os = last + a[i];
			if (is == os) {
				System.out.println("Xylem");
			}
		}
	}
}
