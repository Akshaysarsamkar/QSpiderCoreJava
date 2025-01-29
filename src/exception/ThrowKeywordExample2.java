package exception;

class UserDefineException extends Exception {

	@Override
	public String getMessage() {
		return "User Defined Exception Throw";
	}

}

public class ThrowKeywordExample2 {

	public static void main(String[] args) {

		try {
			throw new UserDefineException();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
