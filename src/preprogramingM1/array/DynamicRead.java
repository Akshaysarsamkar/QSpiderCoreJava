package preprogramingM1.array;

import java.util.Scanner;

public class DynamicRead {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:-");
		int size = scanner.nextInt();

		int array[] = new int[size];
		System.out.println("Enter the array of element");
		for (int i = 0; i < size; i++) {
			System.out.println("Array[" + i + "]");
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < size - 1; i++) {
			System.out.println("Array[" + i + "]=" + array[i]);

		}

	}

}
