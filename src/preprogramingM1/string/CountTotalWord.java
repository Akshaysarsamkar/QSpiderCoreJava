package preprogramingM1.string;

public class CountTotalWord {

	public static void main(String[] args) {

		String s = "i learn java programing language";
		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c++;
			}
		}

		System.out.println("Total word in given string is " + (c + 1));
	}

}
