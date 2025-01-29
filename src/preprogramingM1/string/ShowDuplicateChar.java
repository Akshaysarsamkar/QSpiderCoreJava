package preprogramingM1.string;

public class ShowDuplicateChar {

	public static void main(String[] args) {

		String s = "akshay sarsamkar";

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int c = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					c++;
					ch[j] = (char) Integer.MAX_VALUE;
				}
			}

			if (c > 1 && ch[i] != (char) Integer.MAX_VALUE) {
				System.out.println(ch[i]);
			}
		}

	}

}
