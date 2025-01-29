package Mock;

public class quation7 {

	public static void main(String[] args) {

		String string = "Learn java in a Qspider";

		String s[] = string.split(" ");

		for (int i = 0; i < s.length; i++) {
			String s1 = s[i];
			String t = "";
			if (s1.length() == 1) {
				System.out.print(s1 + " ");
			} else {
				for (int j = s1.length() - 1; j >= 0; j--) {
					t = t + s1.charAt(j);
				}
				System.out.print(t + " ");
			}
		}

	}

}
