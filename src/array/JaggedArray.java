package array;

public class JaggedArray {

	public static void main(String[] args) {

		int a[][] = new int[3][];

		a[0] = new int[5];
		a[1] = new int[4];
		a[2] = new int[3];

		a[1][2] = 78;
		a[0][1] = 45;
		a[2][2] = 32;
		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
