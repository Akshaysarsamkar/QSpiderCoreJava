package preprogramingM1.array;

public class CopyElement {

	public static void main(String[] args) {

		int[] a = { 45, 12, 36, 78, 96, 12 };

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("Array A Element");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("Array B Element");
		for (int n : b) {
			System.out.print(n + " ");
		}

	}

}
