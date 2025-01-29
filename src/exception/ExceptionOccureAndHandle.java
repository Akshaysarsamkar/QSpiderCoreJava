package exception;

public class ExceptionOccureAndHandle {

	public static void main(String[] args) {

		String string = null;

		System.out.println("Main Method Start");
		try {

			System.out.println(string.toUpperCase());

		} catch (NullPointerException e) {
			System.out.println("on Null string cannot perform Operations......");
		}

		System.out.println("Main Method End....");

	}

}
