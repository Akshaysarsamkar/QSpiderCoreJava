package exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		String s = null;
		String s1 = "null";

		System.out.println(s1.toUpperCase());
		System.out.println(s.toUpperCase());  // Occure NullPointerException

	}

}
