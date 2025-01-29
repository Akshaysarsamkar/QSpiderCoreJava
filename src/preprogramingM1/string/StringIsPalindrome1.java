package preprogramingM1.string;

public class StringIsPalindrome1 {

	public static void main(String[] args) {

		String s = "Shanti";

		s = s.toLowerCase();
		boolean f = true;
		int last = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) == s.charAt(last)) {
				f = true;
				last--;
			} else {
				f = false;
				break;
			}
		}

		if (f) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
