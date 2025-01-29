package exception;

public class FinallyBlockWithTryCatch {

	public static void main(String[] args) {

		try {

			System.out.println(12 / 0);

		} catch (NullPointerException e) {
			System.out.println("Exception Occure During the Program");
		} finally {
			System.out.println("Finally Block ");
		}

	}

}
