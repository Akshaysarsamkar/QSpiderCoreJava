package preprogramingM1.string;

public class ConvertIntoLowerCase {

	public static void main(String[] args) {

		String s = "ABCdr";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				char c = (char) (s.charAt(i) + 32);
				System.out.print(c);
			} else {
				System.out.print(s.charAt(i));

			}
		}

	}

}
