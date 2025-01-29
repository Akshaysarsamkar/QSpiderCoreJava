package preprogramingM1.array;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 3, 2, 2, 2, 3, 3, 3, 3, 3, 9, 5, 7 };

		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = '$';
				}
			}
			if (a[i] != '$') {
				System.out.println(a[i]);
			}
		}
	}

}
