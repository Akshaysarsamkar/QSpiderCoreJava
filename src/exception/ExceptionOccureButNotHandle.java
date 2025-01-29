package exception;

public class ExceptionOccureButNotHandle {

	public static void main(String[] args) {

		System.out.println("Main Start...........");
		try {

			System.out.println(12 / 0);

		} catch (NullPointerException e) {
			System.out.println("Number Cannot be Divided By Zero");
		}
		System.out.println("Main Ends...........");

	}

}
