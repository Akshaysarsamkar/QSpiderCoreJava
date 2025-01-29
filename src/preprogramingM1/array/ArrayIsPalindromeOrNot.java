package preprogramingM1.array;

public class ArrayIsPalindromeOrNot {

	public static void main(String[] args) {

		int a[] = { 78, 45, 12, 17, 14, 45, 78 };

		int start = 0, end = a.length - 1, mid = a.length / 2;
		boolean f = true;
		while (start < end) {
			if (a[start] == a[end]) {
				start++;
				end--;
			} else {
				f = false;
				break;
			}
		}

		if (f == false) {
			System.out.println("Array is not palindrome");
		} else {
			System.out.println("Array is palindrome");

		}

	}

}
