package preprogramingM1.string;

public class countVowlesInString {

	public static void main(String[] args) {
		String s = "Hello How Are You";

		s = s.toLowerCase();
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				c++;
			}
		}
		System.out.println("total vowles in: " + s + " is: " + c);

	}

}
