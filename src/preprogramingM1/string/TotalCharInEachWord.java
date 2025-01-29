package preprogramingM1.string;

public class TotalCharInEachWord {

	public static void main(String[] args) {

		String s = "Hello devloper how are you";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' || i == s.length()) {

				System.out.print("=>" + c + "\n");
				c = 0;

			} else {

				c++;
				System.out.print(s.charAt(i));
			}
		}
		System.out.print("=>" + c);

	}

}
