package Mock;

public class RotateString {

	public static void main(String[] args) {

		String s = "Welcome";
		String s1 = null;
		char c = s.charAt(s.length() - 1);

		for (int i = 0; i < s.length() - 1; i++) {

			char temp = s.charAt(i + 1);
			s1 = s1 + temp;

		}
		s1 += c;
		System.out.println(s1);

	}

}
