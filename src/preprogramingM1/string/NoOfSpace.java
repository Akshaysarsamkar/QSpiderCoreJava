package preprogramingM1.string;

public class NoOfSpace {

	public static void main(String[] args) {

		String s = "Learn Java language";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c++;
			}
		}
		System.out.println("total space in word is:" + c);

	}

}
