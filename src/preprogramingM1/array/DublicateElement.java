package preprogramingM1.array;

public class DublicateElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 3, 2, 2, 2, 3, 3, 3, 3, 3, 9, 5, 7 };
		System.out.println("Duplicate Element is: ");
		for (int i = 0; i < a.length; i++) {
			int c = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					a[j] = Integer.MIN_VALUE;
				}
			}

			if (c > 1 && a[i] != Integer.MIN_VALUE) {
				System.out.println(a[i]);
			}
		}

	}

}
