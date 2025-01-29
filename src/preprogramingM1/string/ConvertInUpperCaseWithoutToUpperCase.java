package preprogramingM1.string;

public class ConvertInUpperCaseWithoutToUpperCase {

	public static void main(String[] args) {

		String s = "Akshay is Strong man";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97) {
				char c = s.charAt(i);
				c = (char) ((int) c - 32);
				System.out.print(c);
			} else {
				System.out.print(s.charAt(i));
			}

		}

	}

}
