package preprogramingM1.array;

public class SmallestElement {

	public static int LinearSearch(int a[], int num) {
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int a[] = { 5, 6, 2, 3, 4, 7, 8, 1, -78 };
		
		int linearSearch = LinearSearch(a, 6);
		System.out.println(linearSearch);

	}

}
