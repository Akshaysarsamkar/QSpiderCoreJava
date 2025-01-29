package exception;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {

		String string = "abc";

		System.out.println(string.charAt(5)); // StringIndexOutOfBoundException

	}

}
