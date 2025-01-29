package preprogramingM1.array;

public class OddIndexElement {

	public static void main(String[] args) {

		int[] a = { 45, 65, 12, 87, 96, 45 };

		System.out.println("============================= Odd Index array Value is ===============================");
		for (int i = 0; i <= a.length - 1; i++) {
			if (i % 2 != 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("============================= even Index array Value is ===============================");
		for (int i = 0; i <= a.length - 1; i++) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("============================= Odd element in array ===============================");
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("============================= even element in array ===============================");
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

		int sum = 0;
		System.out.println("============================= sum of element in array ===============================");
		for (int i = 0; i <= a.length - 1; i++) {

			sum = sum + a[i];

		}
		System.out.println("sum of array element is : " + sum);
		System.out.println("Average of an array is " + sum / a.length);

		sum = 0;
		int c = 0;
		System.out.println("============================= sum of Odd element in array ===============================");
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 != 0) {
				sum = sum + a[i];
				c++;
			}
		}
		System.out.println("sum of odd array element is : " + sum);
		System.out.println("Average of an odd element in array is " + sum / c);

		sum = 0;
		c = 0;
		System.out
				.println("============================= sum of even element in array ===============================");
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
				c++;

			}
		}
		System.out.println("sum of even array element is : " + sum);
		System.out.println("Average of an even element in array is " + (sum / c));

	}

}
