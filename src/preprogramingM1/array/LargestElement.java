package preprogramingM1.array;

public class LargestElement {

	public static void main(String[] args) {

		int a[] = { 78, 54, 12, 32, 56, 89, 98, 12 };

		int t = a[0];

		for (int i = 0; i < a.length; i++) {
			if (t < a[i]) {
				t = a[i];
			}

		}
		System.out.println("Largest Number in Array Is: " + t);

	}

}
