package preprogramingM1.array;

import java.util.Scanner;

public class AverageOfOddAndEvenIndexElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Size of an array:");
		int size = scanner.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the Array Element");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		int evenElementSum = 0;
		int evenElementCount = 0;
		int oddElementCount = 0;
		int oddElementSum = 0;

		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				evenElementCount++;
				evenElementSum += a[i];
			} else {
				oddElementCount++;
				oddElementSum += a[i];
			}
		}

		System.out.println("Even element in Average in array is : " + evenElementSum / evenElementCount);
		System.out.println("Odd element in Average in array is : " + oddElementSum / oddElementCount);

	}

}
