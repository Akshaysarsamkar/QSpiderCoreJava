package preprogramingM1.array;

import java.util.Scanner;

public class EvenIndexElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Size of an array:");
		int size = scanner.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the Array Element");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println("Even Index Array Is");
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0)
				System.out.println(a[i]);

		}

		System.out.println("Odd Index Array Is");
		for (int i = 0; i < size; i++) {
			if (i % 2 != 0)
				System.out.println(a[i]);

		}

	}

}
