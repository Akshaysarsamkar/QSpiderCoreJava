package preprogramingM1.array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 45, 56, 65, 74, 85, 98 };

		int num = 65;
		int mid = a.length / 2;
		int start = 0;
		int end = a.length - 1;
		boolean f = false;

		System.out.println(mid);

		if (num > a[mid]) {
			for (int i = mid; i <= a.length - 1; i++) {

				if (num == a[i]) {
					f = true;
					break;
				}
			}
		} else if (num == a[mid]) {
			f = true;
		} else {
			for (int i = 0; i < mid; i++) {
				if (num == a[i]) {
					f = true;
					break;
				}
			}
		}

		if (f) {
			System.out.println(num + " is found in array");
		} else {
			System.out.println(num + " not found in array");
		}

	}

}
