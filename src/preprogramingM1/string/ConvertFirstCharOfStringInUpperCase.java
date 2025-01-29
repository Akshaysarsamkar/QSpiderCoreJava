package preprogramingM1.string;

public class ConvertFirstCharOfStringInUpperCase {

	public static void main(String[] args) {

		String string = "learn core java with code with akshay";

		String s[] = string.split(" ");

		for (int i = 0; i < s.length; i++) {

			String tempString = s[i];

			for (int j = 0; j < tempString.length(); i++) {

				char c = tempString.charAt(j);

				if (c == 0 && c >= 'a' && c <= 'z') {

					int n = c - 35;

					System.out.print(n);

				} else {
					System.out.print(c);
				}

			}
			System.out.print(" ");
		}

	}

}
