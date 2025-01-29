package preprogramingM1.string;

public class RemoveRepeatChar {

	public static void main(String[] args) {

		String s = "Letter";

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int c = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					c++;
					ch[i] = (char) Integer.MIN_VALUE;
				}
			}

			if (c < 2 && ch[i] != (char) Integer.MIN_VALUE) {
				System.out.println(ch[i]);
			}
		}

	}

}
