package preprogramingM1.array;

public class MergeArray {

	public static void main(String[] args) {

		int a1[] = { 12, 54, 78, 32, 45, 89 };
		int a2[] = { 45, 21, 78, 69, 322, 120 };
		int a3[] = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			a3[i + a1.length] = a2[i];
		}

		System.out.print("After Merging Two Array:= ");
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
	}

}
