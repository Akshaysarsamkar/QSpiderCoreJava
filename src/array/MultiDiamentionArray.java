package array;

public class MultiDiamentionArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 8, 6, 9 }, { 1, 1, 4 } };

		System.out.println("========== Using For Loop ==========");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("========== Using ForEach Loop ==========");

		for (int[] n : a) {

			for (int i : n) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
