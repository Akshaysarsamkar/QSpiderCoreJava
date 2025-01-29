package preprogramingM1.string;

public class CountDigitLatterAndSpecialCharacter {

	public static void main(String[] args) {
		String s = "this12";

		int latter = 0;
		int digit = 0;
		int specialChar = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				latter++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				digit++;
			} else {
				specialChar++;
			}

		}

		System.out.println("Total Letter in the word is: " + latter);
		System.out.println("Total Digti in the word is: " + digit);
		System.out.println("Total Special character in the word is: " + specialChar);

	}

}
