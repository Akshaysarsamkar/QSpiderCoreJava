package preprogramingM1.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the Array Element");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int start = 0;
		int end = size - 1;

		//System.out.println(a[mid]);

		while (start <= end) {
			int mid = start + (end-start) / 2;
			if (num < a[mid]) {
				end = mid - 1;
			} else if (num > a[mid]) {
				start = mid + 1;
			} else {
				System.out.println("Enter number is present in array");
			}
		}

	}

}
