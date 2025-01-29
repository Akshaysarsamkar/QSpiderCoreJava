package preprogramingM1.array;

import java.util.Scanner;

public class SearchSumPair {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array");

		int size = scanner.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println("Enter the Element:");
		int ele = scanner.nextInt();

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == ele) {
					System.out.println(a[i] + " , " + a[j]);
				}
			}
		}

	}

}
