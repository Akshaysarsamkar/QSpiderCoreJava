package preprogramingM1.string;

public class EachCharCount {

	public static void main(String[] args) {

		String s = "letter";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();

		System.out.println(ch);

		for (int i = 0; i < ch.length; i++) {
			int c = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					c++;
					ch[j] = (char) Integer.MIN_VALUE;
				}
			}
			if (ch[i] != (char) Integer.MIN_VALUE) {
				System.out.println(ch[i] + " => " + c);
			}
		}

	}

}
