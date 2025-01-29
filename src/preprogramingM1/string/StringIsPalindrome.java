package preprogramingM1.string;

public class StringIsPalindrome {

	public static void main(String[] args) {
		String s = "santo";

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		if (s.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

	@Override
	public String toString() {
		return "StringIsPalindrome []";
	}

}
