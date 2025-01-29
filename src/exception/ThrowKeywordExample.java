package exception;

public class ThrowKeywordExample {

	public static void main(String[] args) {

		String s = "dil";
		if (s.length() < 1) {
			throw new NullPointerException("String Never not null");
		} else {
			System.out.println("Lenght of String is greter than 1");
		}

	}

}
