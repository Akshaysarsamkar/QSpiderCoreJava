package preprogramingM1.array;

import java.util.Scanner;

public class AverageOfArrayElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");

		int size = scanner.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Array Element");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		float avg = sum / a.length;
		System.out.println("Average of Array Element is: " + avg);

	}

}
